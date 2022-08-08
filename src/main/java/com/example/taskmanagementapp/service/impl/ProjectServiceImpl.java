package com.example.taskmanagementapp.service.impl;

import com.example.taskmanagementapp.persistance.model.Project;
import com.example.taskmanagementapp.persistance.repository.IProjectRepository;
import com.example.taskmanagementapp.service.IProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private IProjectRepository projectRepository;

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }
}
