package com.cat.little.mapper;

import com.cat.little.model.User;

public interface UserMapper {

    public User findByName(String name);

    public User findById(Integer id);
}
