package com.example.booksellerspringboot.service;

import java.util.List;

import com.example.booksellerspringboot.entity.Book;

public interface BookService {
    void saveBook(Book book);

    List<Book> getAllBooks();

    void deleteBookById(String bookId);
}
