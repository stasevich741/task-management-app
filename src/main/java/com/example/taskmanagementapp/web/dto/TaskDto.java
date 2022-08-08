package com.example.taskmanagementapp.web.dto;

import com.example.taskmanagementapp.persistance.model.TaskStatus;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Data
public class TaskDto {

    private Long id;

    private String name;

    private String description;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateCreated;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dueDate;

    private TaskStatus status;

    public TaskDto(Long id, String name, String description, LocalDate dateCreated, LocalDate dueDate, TaskStatus status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dueDate = dueDate;
        this.status = status;
    }
}
