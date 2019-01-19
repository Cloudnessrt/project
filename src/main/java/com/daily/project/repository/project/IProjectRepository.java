package com.daily.project.repository.project;

import com.daily.project.entity.project.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjectRepository extends JpaRepository<ProjectEntity,String> {


}
