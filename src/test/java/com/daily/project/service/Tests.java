package com.daily.project.service;

import com.daily.project.ProjectApplication;
import com.daily.project.entity.project.ProjectEntity;
import com.daily.project.repository.project.IProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjectApplication.class)
public class Tests {

    @Autowired
    IProjectRepository iProjectRepository;

    @Test
    public void add(){
        ProjectEntity a=new ProjectEntity();
        a.setId("123");
        a.setCp4(" 已");
        iProjectRepository.save(a);
    }
}
