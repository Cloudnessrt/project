package com.daily.project.enums.common;
/**
 * 有效性枚举
 *
 * @AUTHOR TCH
 * @CREATE 2018-02-14
 **/
public enum ValidEnum  {

    Exist    (1,"有效"),
    Del     (0,"删除");

    private Integer key;
    private String text;

    private  ValidEnum(Integer key,String text){
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
