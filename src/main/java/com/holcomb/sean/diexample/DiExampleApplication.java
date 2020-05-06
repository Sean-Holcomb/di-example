package com.holcomb.sean.diexample;

import com.holcomb.sean.diexample.controllers.*;
import com.holcomb.sean.diexample.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExampleApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiExampleApplication.class, args);

//        I18NController i18NController = (I18NController) ctx.getBean("i18NController");
//        System.out.println(i18NController.sayHello());

        System.out.println("------ Primary Bean");
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());
//        System.out.println("------ Property");
//        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
//        System.out.println(propertyInjectedController.getGreeting());
//
//        System.out.println("------ Setter");
//        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
//        System.out.println(setterInjectedController.getGreeting());
//
//        System.out.println("------ Constructor");
//        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
//        System.out.println(constructorInjectedController.getGreeting());
    }
}
