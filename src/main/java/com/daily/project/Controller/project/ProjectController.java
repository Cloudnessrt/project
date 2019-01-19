package com.daily.project.Controller.project;

import com.daily.project.entity.project.ProjectEntity;
import com.daily.project.service.project.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class ProjectController {

    @Autowired
    IProjectService iProjectService;

    @PostMapping("/users/add1")
    public void addUser( @RequestBody(required=false) ProjectEntity projectEntity){

         iProjectService.save(projectEntity);

    }

    @GetMapping ("/users/add2")
    public Trs addUserz( ){
        ProjectEntity projectEntity=new ProjectEntity();
        projectEntity.setCp4("123");
        Trs trs=new Trs();
        trs.setList(Arrays.asList(projectEntity));
        return trs;
    }

}
