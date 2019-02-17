package com.alex.aspect;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDAO {
    public int addAccount() {
        System.out.println(getClass() + ": adding account");
        return 1;
    }
}
