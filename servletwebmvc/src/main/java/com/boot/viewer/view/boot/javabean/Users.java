package com.boot.viewer.view.boot.javabean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.boot.viewer.view.boot.javabean
 * @date 2019/10/20 4:56 PM
 * @ClassName Users
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Users {
    private int userId;
    private String userName;
    private int userAge;

}
