package com.alex.aspect;

import org.aspectj.lang.annotation.AdviceName;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(Account account, boolean isVip) {
        System.out.println(getClass() + ": DOING SOME ACCOUNT WORK");
    }
    public void updateAccount() {
        System.out.println(getClass() + ": DOING SOME UPDATING ACCOUNT WORK");
    }


}
