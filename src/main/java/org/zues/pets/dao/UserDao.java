package org.zues.pets.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.zues.pets.entity.UserEntity;

@Mapper
public interface UserDao extends BaseMapper<UserEntity> {


}
