package com.lu.dao;

import com.lu.pojo.User;
import com.lu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //方式一 getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user.toString());

        }
        //关闭sqlsession
        sqlSession.close();


    }
    @Test
    public void getUserById(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();

        UserMapper mapper =sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);
        System.out.println(user.toString());

        sqlSession.close();

    }

    @Test
    public void AddUser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.AddUser(new User(4,"lu","123"));
        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }


    @Test
    public void UpdateUser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.UpdateUser(new User(4,"m","1234"));
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void DeleteUserByid(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.DeleteUserById(4);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void UpdateUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        HashMap map = new HashMap<String,Object>();
        map.put("userid",3);
        map.put("name","mm");
        map.put("pwd","12334");

        mapper.UpdateUser2(map);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void UserLike(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        String name = "张";
        List<User> users = mapper.UserLike(name);
        for (User user : users) {
            System.out.println(user.toString());

        }
        sqlSession.close();
    }







}
