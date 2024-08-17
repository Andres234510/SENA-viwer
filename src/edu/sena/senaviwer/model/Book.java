package edu.sena.senaviwer.model;

import java.util.Date;
import java.util.List;

public class Book {
    int id;
    String title;
    Date editorialDate;
    String editorial;
    List<String> authors;
    String isbn;
    boolean readed;
    int timeReaded;

    public Book(String title, Date editorialDate, String editorial, String isbn){
        this.title = title;
        this.editorialDate = editorialDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }
}
