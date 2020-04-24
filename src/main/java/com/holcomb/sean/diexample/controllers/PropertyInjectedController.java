package com.holcomb.sean.diexample.controllers;

import com.holcomb.sean.diexample.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGretting() {
        return greetingService.sayGreeting();
    }
}
