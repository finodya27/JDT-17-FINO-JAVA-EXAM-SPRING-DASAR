package com.indivaragroup.spring.basic.challenge.finalChallenge;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfiguration {

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    public BookService bookService(BookRepository bookRepository) {
        return new BookService(bookRepository);
    }

    @Bean
    public LibraryRunner libraryRunner(BookService bookService) {
        return new LibraryRunner(bookService);
    }
}