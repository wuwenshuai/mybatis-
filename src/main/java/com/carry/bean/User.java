package com.carry.bean;


import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int id;
    private String username;// 用户姓名
    private String sex;// 性别
    private Date birthday;// 生日
    private String address;// 地址
}
