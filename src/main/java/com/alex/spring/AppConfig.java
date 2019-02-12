package com.alex.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.alex.spring")
@PropertySource("app.properties")
public class AppConfig {
    public AppConfig() { }

    @Bean
    public Engine raptorEngine() {
        return new Raptor();
    }

    @Bean
    public Rocket falconHeavy() {
        return new FalconHeavy(raptorEngine());
    }

}
