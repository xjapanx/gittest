package com.x.test.service;

import com.x.test.bean.User;
import com.x.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List list(User user){
        List list = userMapper.findByList(user);
        return list;
    }
}
