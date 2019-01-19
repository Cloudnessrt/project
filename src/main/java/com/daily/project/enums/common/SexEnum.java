package com.daily.project.enums.common;

/**
 * 性别枚举
 *
 * @AUTHOR TCH
 * @CREATE 2018-02-14
 **/
public enum SexEnum  {
	MAN   (1,"男"),
	WOMAN (2,"女");

	private Integer key;
	private String text;

	private  SexEnum(Integer key,String text){
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
