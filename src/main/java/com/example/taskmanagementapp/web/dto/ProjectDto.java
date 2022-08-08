package com.example.taskmanagementapp.web.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class ProjectDto {

    private Long id;

    private String name;

    private LocalDate dateCreated;

    private Set<TaskDto> tasks;

    public ProjectDto() {
    }

    public ProjectDto(Long id, String name, LocalDate dateCreated) {
        this.id = id;
        this.name = name;
        this.dateCreated = dateCreated;
    }
}
