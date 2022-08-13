package com.example.taskmanagementapp.web.controller;

import com.example.taskmanagementapp.persistance.model.Project;
import com.example.taskmanagementapp.service.IProjectService;
import com.example.taskmanagementapp.web.dto.ProjectDto;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    private IProjectService projectService;

    public ProjectController(IProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping(value = "/{id}")
    public ProjectDto findOne(@PathVariable Long id) {
        Project project = projectService.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return convertToDto(project);
    }

    @PostMapping
    public void create(@RequestBody ProjectDto newProject) {
        this.projectService.save(convertToEntity(newProject));
    }

    private ProjectDto convertToDto(Project entity) {
        return new ProjectDto(entity.getId(), entity.getName());
    }

    private Project convertToEntity(ProjectDto dto) {
        Project project = new Project(dto.getName(), null);
        if (StringUtils.isEmpty(dto.getId())) {
            project.setId(dto.getId());
        }
        return project;
    }
}