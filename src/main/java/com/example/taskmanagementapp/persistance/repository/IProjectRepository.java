package com.example.taskmanagementapp.persistance.repository;

import com.example.taskmanagementapp.persistance.model.Project;

import java.util.Optional;

public interface IProjectRepository {

    Optional<Project> findById(Long id);

    Project save(Project project);
}
