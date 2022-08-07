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

    Optional<Project> findById(Long id) {
        log.debug("project service >> finding project by id {}", id);
        return projectRepository.findById(id);
    }


    Project save(Project project) {
        log.debug("project service >> saving project {}", project);
        return projectRepository.save(project);
    }
}
