package com.example.taskmanagementapp.persistance.repository.impl;

import com.example.taskmanagementapp.persistance.model.Project;
import com.example.taskmanagementapp.persistance.repository.IProjectRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectRepositoryImpl implements IProjectRepository {

    List<Project> projectList = new ArrayList<>();

    @Override
    public Optional<Project> findById(Long id) {
        return projectList.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    @Override
    public Project save(Project project) {
        Project existingProject = findById(project.getId()).orElse(null);
        if (existingProject == null) {
            projectList.add(project);
        } else {
            projectList.remove(existingProject);
            Project newProject = new Project(project);
            projectList.add(newProject);
        }
        return project;
    }
}
