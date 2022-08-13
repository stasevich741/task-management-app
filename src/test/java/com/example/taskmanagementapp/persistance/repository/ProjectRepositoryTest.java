package com.example.taskmanagementapp.persistance.repository;

import com.example.taskmanagementapp.persistance.model.Project;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ProjectRepositoryTest {

    @Autowired
    IProjectRepository projectRepository;

    @Test
    public void whenSavingProject_thenSuccess() {
        Project project = new Project("", LocalDate.now());

        Assertions.assertNotNull(projectRepository.save(project));
    }
}
