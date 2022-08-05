package com.example.taskmanagementapp.configuration;

import com.example.taskmanagementapp.persistance.repository.impl.ProjectRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfig {

    @Bean
    ProjectRepositoryImpl projectRepository() {
        return new ProjectRepositoryImpl();
    }
}
