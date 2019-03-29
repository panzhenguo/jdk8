package com.pan.jdk8.pojo;

/**
 * 枚举测试
 */
public enum EnumT1 {
    /**
     * 枚举一
     */
    SQYYX(1,"3000元以下"),
    SQZWQ(2,"3000-5000元"),
    WQDBQ(3,"5000-8000元"),
    BQDYWE(4,"8000-12000元"),
    YWEDLW(5,"12000-20000元"),
    EWYS(6,"20000以上"),
    EWYYX(7,"1万元以下"),
    EZLWY(8,"1-2万元");
    private Integer key;
    private String value;


    EnumT1(int key ,String value){
        this.key=key;
        this.value=value;
    }

    public String getValue(){
        return this.value;
    }

    public static String getValue(int key){
        EnumT1 enumConstant = EnumT1.class.getEnumConstants()[key];
        return enumConstant!=null?enumConstant.getValue():null;


    }

}
