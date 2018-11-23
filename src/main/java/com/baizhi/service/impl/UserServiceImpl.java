package com.baizhi.service.impl;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    //查询所有数据
    public List<User> selectAll(){

        List<User> userList = userDao.selectAll();

        //调用dao层的查询全部数据的方法
        return userList;
    }

}
