package com.alex.aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String...args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MemberShipDAO memberShipDAO = context.getBean("memberShipDAO", MemberShipDAO.class);
        accountDAO.addAccount(new Account(), true);
        accountDAO.updateAccount();
        memberShipDAO.addAccount();
        context.close();
    }
}