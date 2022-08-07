package com.example.taskmanagementapp.persistance.repository.impl;

import com.example.taskmanagementapp.persistance.model.Project;
import com.example.taskmanagementapp.persistance.repository.IProjectRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
public class ProjectRepositoryImpl implements IProjectRepository {

    List<Project> projectList = new ArrayList<>();

    @Override
    public Optional<Project> findById(Long id) {
        log.trace("Project Repository >> finding Project by id {}", id);
        return projectList.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    @Override
    public Project save(Project project) {
        log.trace("Project Repository >> saving Project {}", project);
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
