package com.cat.little.service;

import com.cat.little.model.Permission;
import com.cat.little.model.Role;
import com.cat.little.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


/**
 * Subject 交给SecurityManager
 * SecurityManager  关联Realm
 * Realm Shiro连接数据的桥梁
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userSerivce;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权逻辑");
        Subject subject = SecurityUtils.getSubject();
        List<String> permissionList = new ArrayList<>();
        List<String> roleList = new ArrayList<>();
        User user = (User) subject.getPrincipal();
        Set<Role> uroles = user.getUroles();
        for (Role role : uroles) {
            roleList.add(role.getRname());
            Set<Permission> rermissions = role.getRermissions();
            for (Permission pre : rermissions) {
                permissionList.add(pre.getPname());
            }
        }

        SimpleAuthorizationInfo siainfo = new SimpleAuthorizationInfo();
        siainfo.addStringPermissions(permissionList);


        siainfo.addRoles(roleList);
        return siainfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证逻辑");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        User userToken = userSerivce.findByUserName(username);
        if (userToken.getUserName().equals(token.getUsername())) {
            return new SimpleAuthenticationInfo(userToken, userToken.getUpassword(), this.getClass().getName());
        }
        return null;

    }
}
