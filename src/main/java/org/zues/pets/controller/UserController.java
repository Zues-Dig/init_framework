package org.zues.pets.controller;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zues.pets.model.PageInfo;
import org.zues.pets.params.QueryUserListParam;
import org.zues.pets.result.UserListResult;
import org.zues.pets.sevice.UserService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/get_page")
    public PageInfo<List<UserListResult>> getPage(@RequestBody QueryUserListParam param) {
        return userService.getUserList(param);
    }
}
