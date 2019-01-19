package com.daily.project.enums.common;

/**
 * 使用情况枚举
 *
 * @AUTHOR TCH
 * @CREATE 2018-02-28
 **/
public enum UseEnum  {

    useing   (1,"使用"),
    stopuser (2,"禁用");

    private Integer key;
    private String text;

    private  UseEnum(Integer key,String text){
        this.key=key;
        this.text=text;
    }


    public Integer getKey() {
        return key;
    }


    public String getText() {
        return text;
    }
}
