package com.example.taskmanagementapp.persistance.repository;

import com.example.taskmanagementapp.persistance.model.Project;
import org.springframework.data.repository.PagingAndSortingRepository;

//@Repository
public interface IProjectRepository extends PagingAndSortingRepository<Project, Long> {

}
