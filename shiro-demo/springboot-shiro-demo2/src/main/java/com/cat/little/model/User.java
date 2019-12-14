package com.cat.little.model;


import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class User {
    private Integer uid;
    private String userName;
    private String upassword;
    private Set<Role> uroles = new HashSet<>();


}