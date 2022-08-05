package com.example.taskmanagementapp.service.impl;

import com.example.taskmanagementapp.persistance.model.Project;
import com.example.taskmanagementapp.persistance.repository.IProjectRepository;
import com.example.taskmanagementapp.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private IProjectRepository projectRepository;

    Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }


    Project save(Project project) {
        return projectRepository.save(project);
    }
}
