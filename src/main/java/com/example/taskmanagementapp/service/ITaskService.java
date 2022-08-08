package com.example.taskmanagementapp.service;

import com.example.taskmanagementapp.persistance.model.Task;

import java.util.Optional;

public interface ITaskService {
    Optional<Task> findById(Long id);

    Task save(Task project);
}
