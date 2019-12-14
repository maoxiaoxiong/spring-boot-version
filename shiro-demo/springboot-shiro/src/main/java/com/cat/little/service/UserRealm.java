package com.cat.little.service;

import com.cat.little.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;


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
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Object primaryPrincipal = principalCollection.getPrimaryPrincipal();

//        info.addStringPermission("user:add");
        Subject subject = SecurityUtils.getSubject();
        Object principal = subject.getPrincipal();
        User user = (User) subject.getPrincipal();
        User byId = userSerivce.findById(user.getId());

        info.addStringPermission(byId.getPerms());
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证逻辑");

        UsernamePasswordToken upt =
                (UsernamePasswordToken) authenticationToken;

        User byName = userSerivce.findByName(upt.getUsername());
        if (!upt.getUsername().equals(byName.getName())) {
            return null;
        }
        return new SimpleAuthenticationInfo(byName, byName.getPassword(), "");
//        return new SimpleAuthenticationInfo("", "1", "");
    }
}
