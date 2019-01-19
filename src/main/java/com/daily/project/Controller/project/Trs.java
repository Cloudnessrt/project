package com.daily.project.Controller.project;

import java.util.ArrayList;
import java.util.List;

public class Trs {

    private List list=new ArrayList<>();

    private Object pagination;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Object getPagination() {
        return pagination;
    }

    public void setPagination(Object pagination) {
        this.pagination = pagination;
    }
}
