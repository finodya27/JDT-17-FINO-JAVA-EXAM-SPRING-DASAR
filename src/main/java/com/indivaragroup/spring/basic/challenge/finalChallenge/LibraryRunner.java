package com.indivaragroup.spring.basic.challenge.finalChallenge;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LibraryRunner {

    private final BookService bookService;

    public void run() {

        bookService.addBook(1, "Clean Code");
        bookService.addBook(2, "Spring In Action");
        bookService.addBook(3, "Effective Java");

        System.out.println("Library:");
        for (Book book : bookService.getAllBooks()) {
            System.out.println(book.getId() + ". " + book.getTitle());
        }
        System.out.println();
        System.out.println("Book ID 2 : " + bookService.getBookById(2).getTitle());
    }
}