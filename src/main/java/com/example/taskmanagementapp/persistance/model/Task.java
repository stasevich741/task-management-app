package com.example.taskmanagementapp.persistance.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
//@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    @Column(name = "name")
    private String name;

    //    @Column(name = "description")
    private String description;

    //    @Column(name = "date_created")
    private LocalDate dateCreated;

    //    @Column(name = "due_date")
    private LocalDate dueDate;

    @Enumerated(EnumType.STRING)
//    @Column(name = "status")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(name, task.name) && Objects.equals(description, task.description) && Objects.equals(dateCreated, task.dateCreated) && Objects.equals(dueDate, task.dueDate) && status == task.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, dateCreated, dueDate, status);
    }
}
