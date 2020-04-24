package com.holcomb.sean.diexample.controllers;

import com.holcomb.sean.diexample.services.GreetingService;

public class SetterInjectiedController {

    public GreetingService greetingService;

    public  void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
