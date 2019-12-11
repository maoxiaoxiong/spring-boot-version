package com.cat.little.mapper;

import com.cat.little.domain.User;

public interface UserMapper {

    public User findByName(String name);

    public User findById(Integer id);
}
