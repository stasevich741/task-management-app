package com.example.taskmanagementapp.controller;

import com.example.taskmanagementapp.persistance.model.Project;
import com.example.taskmanagementapp.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    @Autowired
    private IProjectService projectService;

    public ProjectController(IProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping(value = "/{id}")
    public Project findOne(@PathVariable Long id) {
        return projectService.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public void create(@RequestBody Project project) {
        this.projectService.save(project);
    }

}
