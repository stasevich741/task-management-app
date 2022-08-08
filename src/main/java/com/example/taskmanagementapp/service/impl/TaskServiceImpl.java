package com.example.taskmanagementapp.service.impl;

import com.example.taskmanagementapp.persistance.model.Task;
import com.example.taskmanagementapp.persistance.repository.ITaskRepository;
import com.example.taskmanagementapp.service.ITaskService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskServiceImpl implements ITaskService {

    private ITaskRepository taskRepository;

    public TaskServiceImpl(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Optional<Task> findById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public Task save(Task project) {
        return taskRepository.save(project);
    }
}
