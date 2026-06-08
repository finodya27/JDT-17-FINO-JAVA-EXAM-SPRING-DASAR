package com.indivaragroup.spring.basic.challenge.challengeEight;

public class Student {

    private Integer id;
    private String name;

    public Student (Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
