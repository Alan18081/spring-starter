package com.alex.aspect;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDAO {
    private String name;

    public String getName() {
        System.out.println(getClass() + ": getName");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": setName");
        this.name = name;
    }

    public int addAccount() {
        System.out.println(getClass() + ": adding account");
        return 1;
    }


}
