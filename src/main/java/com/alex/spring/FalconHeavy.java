package com.alex.spring;

import org.springframework.beans.factory.annotation.Value;

public class FalconHeavy implements Rocket {

    @Value("${falcon.name}")
    public String name;

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    @Value("${falcon.company}")
    public String company;

    private Engine engine;

    public FalconHeavy(Engine engine) {
        this.engine = engine;
    }

    public int getEnginePower() {
        return engine.power();
    }
}
