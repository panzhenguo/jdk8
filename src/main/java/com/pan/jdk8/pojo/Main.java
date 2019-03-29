package com.pan.jdk8.pojo;

/**
 * @ClassName Main
 * @Description TODO
 * @Date 2019/3/29 15:30
 * @Version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(        EnumT1.class.getEnumConstants()[0].getValue());
        System.out.println(        EnumT1.class.getEnumConstants()[7].getValue());
    }
}
