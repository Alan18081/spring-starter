package com.alex.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {

    @Pointcut("execution( * com.alex.aspect.*.*(..))")
    public void forDao() { }

    @Pointcut("execution(* com.alex.aspect.*.get*(..))")
    private void getter() {}

    @Pointcut("execution(* com.alex.aspect.*.set*(..))")
    private void setter() {}

    @Pointcut("forDao() && !(getter() || setter())")
    private void forDaoWithoutGetterAndSetter() {}

    @Before("forDaoWithoutGetterAndSetter()")
    public void beforeAddAccount() {
        System.out.println("=> Before adding");
    }


    @After("forDaoWithoutGetterAndSetter()")
    public void performAnalytics() {
        System.out.println("=> Performing analytics");
    }

}
