package com.library.service;

import com.library.Book;
import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        System.out.println("Adding book: "
                + book.getTitle()
                + " by "
                + book.getAuthor());

        bookRepository.saveBook(book);
    }
}