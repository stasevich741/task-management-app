package com.example.taskmanagementapp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class ContextTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void whenContextIsLoaded_thenNoException() {
        //
    }

    @Test
    public void whenContextIsLoaded_thenNoException2() {
        //
    }
}
