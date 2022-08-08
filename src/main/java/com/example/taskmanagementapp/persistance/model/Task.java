package com.example.taskmanagementapp.persistance.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "date_created")
    private LocalDate dateCreated;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private TaskStatus status;

    public Task() {
    }

    public Task(String name, String description, LocalDate dateCreated, LocalDate dueDate) {
        this.name = name;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dueDate = dueDate;
        this.status = TaskStatus.TO_DO;
    }

    public Task(String name, String description, LocalDate dateCreated, LocalDate dueDate, TaskStatus status) {
        this.name = name;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dueDate = dueDate;
        this.status = status;
    }

    public Task(Task task) {
        this(task.getName(), task.getDescription(), task.getDateCreated(), task.getDueDate());
    }

}
