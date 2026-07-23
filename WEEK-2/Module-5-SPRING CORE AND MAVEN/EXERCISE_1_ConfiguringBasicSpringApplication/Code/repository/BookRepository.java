package com.library.repository;

import com.library.Book;

public class BookRepository {

    public void saveBook(Book book) {
        System.out.println("Saving book: "
                + book.getTitle()
                + " by "
                + book.getAuthor());
    }
}