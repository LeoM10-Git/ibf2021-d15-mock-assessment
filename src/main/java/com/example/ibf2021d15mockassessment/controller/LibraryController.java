package com.example.ibf2021d15mockassessment.controller;


import com.example.ibf2021d15mockassessment.model.Book;
import com.example.ibf2021d15mockassessment.model.CreateLibraryBook;
import com.example.ibf2021d15mockassessment.service.LibraryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/library")
public class LibraryController {
    private LibraryService libraryService;
    private CreateLibraryBook createLibrary;

    public LibraryController(LibraryService libraryService, CreateLibraryBook createLibrary) {
        this.libraryService = libraryService;
        this.createLibrary = createLibrary;
    }

    @PostConstruct
    public void createLibrary() {
        createLibrary.createLibraryBook();
    }

    @GetMapping
    public String libraryHome(Model model) {
        List<Book> books = libraryService.findAllBooks();
        model.addAttribute("books", books);
        return "library";
    }


    @GetMapping("/sortById")
    public String sortById(Model model) {
        List<Book> books = libraryService.sortById();
        model.addAttribute("books", books);

        return "library";
    }

    @GetMapping("/findBook")
    public String findBook(Model model,
                           @RequestParam(name="author", required = false) String author,
                           @RequestParam(name="title", required = false) String title) {
        if (author != null & title != null) {
            List<Book> book = libraryService.findBookByAuthor(author);
            if (book != null && book.size() > 0) {
                model.addAttribute("books",book);
            }else{
                List<Book> bookByTitle = libraryService.findBookByTitle(title);
                if (bookByTitle != null && bookByTitle.size() > 0) {
                    model.addAttribute("books",bookByTitle);
                }
            }
        }
        else if (author != null){
            List<Book> book = libraryService.findBookByAuthor(author);
            model.addAttribute("books",book);
        }
        else if (title != null){
            List<Book> book = libraryService.findBookByTitle(title);
            model.addAttribute("books",book);
        }
        return"/library";
    }
}
