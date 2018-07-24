package com.spring.dao;

import com.spring.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//public interface UserDao extends BaseDao<User>{
//    // 直接继承父类的增删改查方法
//
//    // 定义新的方法
//}

public interface UserDao {
     List<User> find(@Param("username") String username,
                           @Param("password") String password);
}