package com.example.ibf2021d15mockassessment.service;

import com.example.ibf2021d15mockassessment.model.Book;
import com.example.ibf2021d15mockassessment.repository.LibraryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService implements LibraryServiceImp{
    private LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }


    @Override
    public Book findBookById(int id) {
        return libraryRepository.findBookById(id);
    }

    @Override
    public List<Book> findBookByTitle(String title) {
        return libraryRepository.findBookByTitle(title);
    }

    @Override
    public List<Book> findBookByAuthor(String author) {
        return libraryRepository.findBookByAuthor(author);
    }

    @Override
    public List<Book> findAllBooks() {
        return libraryRepository.findAllBooks();
    }

    @Override
    public void createLibraryBook(Book book) {
        libraryRepository.createLibraryBook(book);
    }

    @Override
    public List<Book> sortById() {
        return libraryRepository.sortById();
    }
}
