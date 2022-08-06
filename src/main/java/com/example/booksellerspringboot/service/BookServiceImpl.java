package com.example.booksellerspringboot.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.booksellerspringboot.entity.Book;
import com.example.booksellerspringboot.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public void saveBook(Book book) {
        book.setCreatedTime(LocalDateTime.now());
        book.setUpdatedTime(LocalDateTime.now());
        this.bookRepository.saveBook(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookRepository.getAllBooks();
    }

    @Override
    @Transactional
    public void deleteBookById(String bookId) {
        this.bookRepository.deleteBookById(bookId);
    }
    
}
