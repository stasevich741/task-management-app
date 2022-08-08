package com.example.taskmanagementapp.persistance.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_created")
    private LocalDate dateCreated;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
    private Set<Task> tasks;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id) && Objects.equals(name, project.name) && Objects.equals(dateCreated, project.dateCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateCreated);
    }
}
