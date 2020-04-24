package com.holcomb.sean.diexample.controllers;

import com.holcomb.sean.diexample.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectiedControllerTest {

    SetterInjectiedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectiedController();

        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}