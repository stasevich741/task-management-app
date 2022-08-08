package com.example.taskmanagementapp.persistance.model;

import lombok.Getter;

@Getter
public enum TaskStatus {
    //@formatter:off
    TO_DO("To Do"),
    IN_PROGRESS("In Progress"),
    ON_HOLD("On Hold"),
    DONE("Done");
    //@formatter:on

    private final String label;

    private TaskStatus(String label) {
        this.label = label;
    }
}
