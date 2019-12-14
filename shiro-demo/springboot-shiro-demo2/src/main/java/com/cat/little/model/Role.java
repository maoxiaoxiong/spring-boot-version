package com.cat.little.model;


import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Role {
    private Integer rid;
    private String rname;
    private Set<Permission> rermissions = new HashSet<>();

}