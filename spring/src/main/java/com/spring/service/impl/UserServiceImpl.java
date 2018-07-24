package com.spring.service.impl;

import com.spring.dao.UserDao;

import com.spring.entity.User;
import com.spring.service.UserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Service // 包扫描时，扫描到这个包
public class UserServiceImpl implements UserService  {

    @Resource // 自动注入持久层
    private UserDao userDao;

    @Override
    public List<User> find(String username,String password) {
        List<User> userList =  userDao.find(username,password);
        System.out.println("ok---service");
        return userList;
    }
//
//    @Override
//    public User get(Integer id) {
//        return userDao.get(id);
//    }
//
//    @Override
//    public void deleteById(Integer id) {
//        userDao.deleteById(id);
//    }
//
//    @Override
//    public void insert(User user) {
//        userDao.insert(user);
//    }
//
//    @Override
//    public void update(User user) {
//        userDao.update(user);
//    }
//
//    @Override
//    public void delete(Serializable[] ids) {
//        userDao.delete(ids);
//    }


}
