package com.example.taskmanagementapp;

import com.example.taskmanagementapp.persistance.model.Project;
import com.example.taskmanagementapp.persistance.model.Task;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.example.taskmanagementapp",
        exclude = {DataSourceAutoConfiguration.class})
public class TaskManagementAppApplication {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Project.class)
                .addAnnotatedClass(Task.class)
                .buildSessionFactory();

        SpringApplication.run(TaskManagementAppApplication.class, args);
    }

}
