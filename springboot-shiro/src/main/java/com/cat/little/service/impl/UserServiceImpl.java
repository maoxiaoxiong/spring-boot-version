package com.cat.little.service.impl;


import com.cat.little.domain.User;
import com.cat.little.mapper.UserMapper;
import com.cat.little.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    //注入Mapper接口
    @Autowired
    private UserMapper userMapper;


    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }


}
