package com.pan.jdk8.pojo;

public enum Color {
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
    // 成员变量  
    private String name;
    private int index;

    // 构造方法  
     Color(String name, int index) {
        this.name = name;
        this.index = index;
    }

    //覆盖方法  
    @Override
    public String toString() {
        return this.index + "_" + this.name;
    }
}