package com.daily.project.service.project.impl;

import com.daily.project.entity.project.ProjectEntity;
import com.daily.project.repository.project.IProjectRepository;
import com.daily.project.service.project.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService {
    @Autowired
    IProjectRepository iProjectRepository;

    @Override
    public ProjectEntity save(ProjectEntity projectEntity){
        return iProjectRepository.save(projectEntity);
    }
}
