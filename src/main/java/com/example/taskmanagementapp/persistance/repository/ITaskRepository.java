package com.example.taskmanagementapp.persistance.repository;

import com.example.taskmanagementapp.persistance.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface ITaskRepository extends CrudRepository<Task, Long> {
}
