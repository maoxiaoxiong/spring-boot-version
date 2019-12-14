package com.cat.little.mapper;

import com.cat.little.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public User findByUserName(@Param("userName") String name);
}
