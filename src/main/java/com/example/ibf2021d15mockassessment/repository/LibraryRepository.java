package com.example.ibf2021d15mockassessment.repository;

import com.example.ibf2021d15mockassessment.model.Book;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.query.SortQuery;
import org.springframework.data.redis.core.query.SortQueryBuilder;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class LibraryRepository{
    private RedisTemplate redisTemplate;
    private static final String HASH_KEY = "Book";

    public LibraryRepository(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void createLibraryBook(Book book){
        redisTemplate.opsForHash().put(HASH_KEY,book.getId(),book);
    }

    public List<Book> findAllBooks(){
        return redisTemplate.opsForHash().values(HASH_KEY);
    }

    public Book findBookById(int id){
        return (Book) redisTemplate.opsForHash().get(HASH_KEY,id);
    }

    public List<Book> findBookByTitle(String title){
        List<Book> foundBook = new LinkedList<>();
        List<Book> books = redisTemplate.opsForHash().values(HASH_KEY);
        for (Book book: books){
            if (title.equals(book.getTitle())){
                foundBook.add(book);
            }
        }
        return foundBook;
    }

    public List<Book> findBookByAuthor(String author){
        List<Book> foundBook = new LinkedList<>();
        List<Book> books = redisTemplate.opsForHash().values(HASH_KEY);
        for (Book book: books){
            if (author.equals(book.getAuthor())){
                foundBook.add(book);
            }
        }
        return foundBook;
    }

    public List<Book> sortById(){
//       String key = (String)redisTemplate.opsForHash().get(HASH_KEY);
//
//        SortQuery<String> query = SortQueryBuilder.sort();
//        return redisTemplate.sort(query);
        return null;
    }
}
