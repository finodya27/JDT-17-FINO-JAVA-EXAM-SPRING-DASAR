package com.indivaragroup.spring.basic.challenge.finalChallenge;

public class Book {

    private Integer id;
    private String title;

    public Book(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}