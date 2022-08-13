package com.example.taskmanagementapp.web.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
public class ProjectDto {

    private Long id;

    private String name;

    private Set<TaskDto> tasks;

    public ProjectDto() {
    }

    public ProjectDto(Long id, String name, LocalDate dateCreated) {
        this.id = id;
        this.name = name;
    }

    public ProjectDto(Long id, String name) {
        this.id = id;
        this.name = name;
        this.tasks = new HashSet<>();
    }
}
