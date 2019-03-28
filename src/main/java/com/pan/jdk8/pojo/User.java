package com.pan.jdk8.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String name;
    private Integer sex;
    private Date createDate;
}
