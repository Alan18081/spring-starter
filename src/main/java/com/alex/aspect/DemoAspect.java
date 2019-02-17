package com.alex.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {

    @Before("execution( * com.alex.aspect.*.*Account(Account))")
    public void beforeAddAccount() {
        System.out.println("Before some stuff");
    }

}
