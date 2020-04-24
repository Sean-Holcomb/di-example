package com.holcomb.sean.diexample.controllers;

import com.holcomb.sean.diexample.services.GreetingService;
import com.holcomb.sean.diexample.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGretting() {

        System.out.println((controller.getGretting()));
    }
}