package com.indivaragroup.spring.basic.challenge.finalChallenge;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public void addBook(Integer id, String title) {
        bookRepository.save(new Book(id, title));
    }

    public Book getBookById(Integer id) {
        return bookRepository.findById(id);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}