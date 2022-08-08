package com.example.taskmanagementapp.persistance.repository;

import com.example.taskmanagementapp.persistance.model.Project;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProjectRepository extends PagingAndSortingRepository<Project, Long> {
}
