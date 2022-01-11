package com.example.ibf2021d15mockassessment.model;


import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Book")
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String title;
    private String author;
    private String thumbnail;

    public Book(int id, String title, String author, String thumbnail) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.thumbnail = thumbnail;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }
}
