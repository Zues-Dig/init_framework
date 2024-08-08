package org.zues.pets.sevice;

import org.springframework.stereotype.Service;
import org.zues.pets.model.PageInfo;
import org.zues.pets.params.QueryUserListParam;
import org.zues.pets.result.UserListResult;

import java.util.List;


public interface UserService {

    PageInfo<List<UserListResult>> getUserList(QueryUserListParam param);


}
