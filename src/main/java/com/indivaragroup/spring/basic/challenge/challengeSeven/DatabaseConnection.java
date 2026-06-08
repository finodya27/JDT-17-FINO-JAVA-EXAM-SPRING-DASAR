package com.indivaragroup.spring.basic.challenge.challengeSeven;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class DatabaseConnection {

    @PostConstruct
    public void connect() {
        System.out.println("Database Connected");
    }

    @PreDestroy
    public void disconneect() {
        System.out.println("Database Disconnected");
    }
}
