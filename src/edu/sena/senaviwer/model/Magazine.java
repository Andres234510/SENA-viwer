package edu.sena.senaviwer.model;

import java.util.Date;
import java.util.List;

public class Magazine {
    int id;
    String title;
    String editorialDate;
    String editorial;
    List<String> authors;

    public Magazine(String title, String editorialDate, String editorial){
        this.title = title;
        this.editorialDate = editorialDate;
        this.editorial = editorial;
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

}
