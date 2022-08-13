package com.example.taskmanagementapp.persistance.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate dateCreated;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
    private Set<Task> tasks;

    public Project(String name, LocalDate dateCreated) {
        this.name = name;
        this.dateCreated = dateCreated;
        this.tasks = new HashSet<>();
    }

    protected Project() {
    }

    public Project(Project project) {
        this(project.getName(), project.getDateCreated());
        this.tasks = new HashSet<>(project.getTasks());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id) && Objects.equals(name, project.name) && Objects.equals(dateCreated, project.dateCreated) && Objects.equals(tasks, project.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateCreated, tasks);
    }
}
