package com.daily.project.enums.project;

public enum ProjectEnum {
    one   (1," 项目"),
    group (2,"项目集");

    private Integer key;
    private String text;

    private  ProjectEnum(Integer key,String text){
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
