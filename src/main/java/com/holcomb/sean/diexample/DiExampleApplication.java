package com.holcomb.sean.diexample;

import com.holcomb.sean.diexample.controllers.ConstructorInjectedController;
import com.holcomb.sean.diexample.controllers.MyController;
import com.holcomb.sean.diexample.controllers.PropertyInjectedController;
import com.holcomb.sean.diexample.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExampleApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiExampleApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("------ Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
//        propertyInjectedController.greetingService = new GreetingServiceImpl();
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------ Setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------ Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }
}
