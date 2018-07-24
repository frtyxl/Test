package com.spring.service;

import com.spring.entity.User;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Service
public interface UserService {

    /**
     * 访问用户列表
     * @return
     */
    List<User> find(String userName,String password);
//    User get(Integer id);
//    void deleteById(Integer id);
//    void insert(User user);
//    void update(User user);
//    void delete(Serializable[] ids);

}
