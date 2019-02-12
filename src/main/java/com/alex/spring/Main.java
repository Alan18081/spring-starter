package com.alex.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String...args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Rocket falcon = context.getBean("falconHeavy", Rocket.class);
        System.out.println(falcon.getEnginePower());
        System.out.println(falcon.getCompany());
        System.out.println(falcon.getName());
    }
}
