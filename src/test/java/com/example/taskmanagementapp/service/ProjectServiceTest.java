package com.example.taskmanagementapp.service;

import com.example.taskmanagementapp.persistance.model.Project;
import com.example.taskmanagementapp.spring.TestConfig;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;


@SpringJUnitConfig(classes = TestConfig.class)
public class ProjectServiceTest {

    @Autowired
    private IProjectService projectService;

    @Test
    public void whenSavingProject_thenOK() {
        Project project = projectService.save(new Project("name", LocalDate.now()));

        MatcherAssert.assertThat(project, is(notNullValue()));
    }
}
