package com.indivaragroup.spring.basic.challenge.finalChallenge;

import java.util.List;

public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

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