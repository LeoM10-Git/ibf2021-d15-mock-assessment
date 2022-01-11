package com.example.ibf2021d15mockassessment.model;

import com.example.ibf2021d15mockassessment.service.LibraryService;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CreateLibraryBook {
    private LibraryService libraryService;

    public CreateLibraryBook(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public void createLibraryBook() {
        List<Book> books = new LinkedList<>();
        Book book1 = new Book(1, "The House on Mango Street", "Sandra Cisneros",
                "https://www.penguinrandomhouse.com/books/27844/" +
                        "the-house-on-mango-street-by-sandra-cisneros/9780679734772/");
        Book book2 = new Book(2, "The Picture of Dorian Gray", "Oscar Wilde",
                "https://www.penguinrandomhouse.com/books/595383/" +
                        "the-picture-of-dorian-gray-by-oscar-wilde/9780307743527/");
        Book book3 = new Book(3, "Never Let Me Go", "Kazuo Ishiguro",
                "https://www.penguinrandomhouse.com/books/85609/" +
                        "never-let-me-go-by-kazuo-ishiguro/9781400078776/");
        Book book4 = new Book(4, "The Road", "Cormac McCarthy",
                "https://www.penguinrandomhouse.com/books/110490/" +
                        "the-road-by-cormac-mccarthy/9780307387899/");
        Book book5 = new Book(5, "Norwegian Wood (Movie Tie-in Edition)", "Haruki Murakami",
                "https://www.penguinrandomhouse.com/books/118720/" +
                        "norwegian-wood-movie-tie-in-edition-by-haruki-murakami/9780307950628/");
        Book book6 = new Book(6, "March: Book One (Oversized Edition)", "John Lewis and Andrew Aydin",
                "https://www.penguinrandomhouse.com/books/560278/" +
                        "march-book-one-oversized-edition-by-john-lewis-andrew-aydin-nate-powell/9781603093835/");
        Book book7 = new Book(7, "The Hobbit", "J.R.R. Tolkien",
                "https://www.penguinrandomhouse.com/books/179206/" +
                        "the-hobbit-movie-tie-in-edition-by-jrr-tolkien/9780345534835/");
        Book book8 = new Book(8, "Pride and Prejudice", "Jane Austen",
                "https://www.penguinrandomhouse.com/books/313039/" +
                        "pride-and-prejudice-by-jane-austen/9780143123163/");
        Book book9 = new Book(9, "A Tale of Two Cities", "Charles Dickens",
                "https://www.penguinrandomhouse.com/books/286394/" +
                        "a-tale-of-two-cities-by-charles-dickens/9780141196909/");
        Book book10 = new Book(10, "Crime and Punishment", "Fyodor Dostoyevsky",
                "https://www.penguinrandomhouse.com/books/318117/" +
                        "crime-and-punishment-by-fyodor-dostoyevsky/9780143107637/");
        Book book11 = new Book(11, "We Should All Be Feminists", "Chimamanda Ngozi Adichie",
                "https://www.penguinrandomhouse.com/books/246919/" +
                        "we-should-all-be-feminists-by-chimamanda-ngozi-adichie/9781101911761/");
        Book book12 = new Book(1, "The House on Mango Street", "Sandra Cisneros",
                "https://www.penguinrandomhouse.com/books/27844/" +
                        "the-house-on-mango-street-by-sandra-cisneros/9780679734772/");
        Book book13 = new Book(13, "The Grapes of Wrath", "John Steinbeck",
                "https://www.penguinrandomhouse.com/books/315625/" +
                        "the-grapes-of-wrath-by-john-steinbeck/9780670016907/");
        Book book14 = new Book(14, "Hamlet", "WILLIAM SHAKESPEARE",
                "https://www.penguinrandomhouse.com/books/319037/" +
                        "hamlet-by-william-shakespeare/9780143128540/");
        Book book15 = new Book(15, "Rebecca", "DAPHNE DU MAURIER",
                "https://www.penguinrandomhouse.com/books/43579/" +
                        "rebecca-by-daphne-du-maurier-introduction-by-lucy-hughes-hallett/9781101907870/");
        Book book16 = new Book(16, "1984", "GEORGE ORWELL",
                "https://www.penguinrandomhouse.com/books/326569/" +
                        "1984-by-george-orwell-with-a-foreword-by-thomas-pynchon/9780452284234/");
        Book book17 = new Book(17, "On the Road", "JACK KEROUAC",
                "https://www.penguinrandomhouse.com/books/540750/" +
                        "on-the-road-by-jack-kerouac-introduction-by-ann-charters/9780142437254/");
        Book book18 = new Book(18, "Beloved", "Beloved",
                "https://www.penguinrandomhouse.com/books/117647/" +
                        "beloved-by-toni-morrison/9780307264886/");
        Book book19 = new Book(19, "The Secret Life of Bees", "SUE MONK KIDD",
                "https://www.penguinrandomhouse.com/books/314319/" +
                        "the-secret-life-of-bees-by-sue-monk-kidd/9780143124320/");
        Book book20 = new Book(1, "The House on Mango Street", "Sandra Cisneros",
                "https://www.penguinrandomhouse.com/books/27844/" +
                        "the-house-on-mango-street-by-sandra-cisneros/9780679734772/");
        Collections.addAll(books, book1, book2, book3, book4, book5, book6, book7, book8,
                book9, book10, book11, book12, book13, book14, book15, book16, book17, book18, book19, book20);
        for (Book book : books) {
            libraryService.createLibraryBook(book);
        }
    }
}
