package com.example.taskmanagementapp.service;

import com.example.taskmanagementapp.persistance.model.Project;

import java.util.Optional;

public interface IProjectService {

    Optional<Project> findById(Long id);

    Project save(Project project);
}
