package edu.sena.senaviwer.model;

import java.util.Date;
import java.util.List;

public class Book {
    int id;
    String title;
    String editorialDate;
    String editorial;
    List<String> authors;
    String isbn;
    boolean readed;
    int timeReaded;

    public Book(String title, String editorialDate, String editorial, String isbn){
        this.title = title;
        this.editorialDate = editorialDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getEditorialDate() {
        return editorialDate;
    }

    public void setEditorialDate(String editorialDate){
        this.editorialDate = editorialDate;
    }

    public String getEditorial(){
        return editorial;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public boolean getViewed() {
        return false;
    }
}
