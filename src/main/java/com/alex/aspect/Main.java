package com.alex.aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String...args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MemberShipDAO memberShipDAO = context.getBean("memberShipDAO", MemberShipDAO.class);
        accountDAO.addAccount(new Account(), true);
        memberShipDAO.setName("Hello");
        System.out.println(memberShipDAO.getName());
        context.close();
    }
}