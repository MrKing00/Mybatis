package com.lu.dao;

import com.lu.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //insert 一个用户
    int AddUser(User user);


    //更新数据 传入User
    int UpdateUser(User user);

    //更新数据 传入 map
    int UpdateUser2(Map<String,Object> map);


    //删除用户
    void DeleteUserById(int id);

    //模糊查询用户
    List<User> UserLike(String name);
}
