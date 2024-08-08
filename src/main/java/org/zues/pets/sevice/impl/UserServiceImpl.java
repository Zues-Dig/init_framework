package org.zues.pets.sevice.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import org.zues.pets.dao.UserDao;
import org.zues.pets.entity.UserEntity;
import org.zues.pets.model.PageInfo;
import org.zues.pets.params.QueryUserListParam;
import org.zues.pets.result.UserListResult;
import org.zues.pets.sevice.UserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public PageInfo<List<UserListResult>> getUserList(QueryUserListParam param) {
        Page<UserEntity> page = new Page<>(param.getPageCurrent(), param.getPageSize());
        LambdaQueryWrapper<UserEntity> userEntityLambdaQueryWrapper = new LambdaQueryWrapper<>();

        userEntityLambdaQueryWrapper
                .like(StrUtil.isNotEmpty(param.getName()), UserEntity::getName, param.getName());
        userEntityLambdaQueryWrapper
                .eq(param.getGender() != null, UserEntity::getGender, param.getGender());

        Page<UserEntity> result = userDao.selectPage(page, userEntityLambdaQueryWrapper);
        List<UserListResult> collect = result.getRecords()
                .stream().map(UserListResult::new).collect(Collectors.toList());
        return new PageInfo<>(collect, result.getTotal());
    }


}
