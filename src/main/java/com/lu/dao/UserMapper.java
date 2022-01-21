package com.lu.dao;

import com.lu.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //��ѯȫ���û�
    List<User> getUserList();

    //����id��ѯ�û�
    User getUserById(int id);

    //insert һ���û�
    int AddUser(User user);


    //�������� ����User
    int UpdateUser(User user);

    //�������� ���� map
    int UpdateUser2(Map<String,Object> map);


    //ɾ���û�
    void DeleteUserById(int id);

    //ģ����ѯ�û�
    List<User> UserLike(String name);
}
