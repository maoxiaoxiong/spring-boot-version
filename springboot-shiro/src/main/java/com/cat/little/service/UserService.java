package com.cat.little.service;

import com.cat.little.domain.User;

public interface UserService {

    public User findByName(String name);

    public User findById(Integer id);

}
