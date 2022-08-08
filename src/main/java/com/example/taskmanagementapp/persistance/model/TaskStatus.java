package com.example.taskmanagementapp.persistance.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskStatus {
    TO_DO("To Do"),
    IN_PROGRESS("In Progress"),
    ON_HOLD("On Hold"),
    DONE("Done");

    private final String label;
}
