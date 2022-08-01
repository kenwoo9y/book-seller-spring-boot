package com.example.booksellerspringboot.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.booksellerspringboot.entity.Book;

@Repository
@Mapper
public interface BookRepository {
    public Book saveBook();

    public List<Book> getAllBooks();

    public void deleteBookById(String bookId);
}
