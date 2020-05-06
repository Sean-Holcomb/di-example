package com.holcomb.sean.diexample.services;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository{
    @Override
    public String getEnglishGreeting() {
        return "Hello";
    }

    @Override
    public String getSpanishGreeting() {
        return "Ola";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo";
    }
}
