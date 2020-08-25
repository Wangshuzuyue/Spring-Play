package com.hzw.springboot.jdbc.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author: huangzuwang
 * @date: 2019-09-10 18:12
 * @description:
 */
@Data
@Table(name = "t_user")
public class User {

    @Column(name = "user_name")
    String userName;

    @Column(name = "password")
    String password;

    @Column(name = "phone")
    String phone;

}
