package com.example.ibf2021d15mockassessment.service;

import com.example.ibf2021d15mockassessment.model.Book;

import java.util.List;

public interface LibraryServiceImp {
    public Book findBookById(int id);
    public List<Book> findBookByTitle(String title);
    public List<Book> findBookByAuthor(String author);
    public List<Book> findAllBooks();
    public void createLibraryBook(Book book);

    List<Book> sortById();
}
