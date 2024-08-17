package edu.sena.senaviwer.model;

import java.util.Date;
import java.util.List;

public class Magazine {
    int id;
    String title;
    Date editorialDate;
    String editorial;
    List<String> authors;

    public Magazine(String title, Date editorialDate, String editorial){
        this.title = title;
        this.editorialDate = editorialDate;
        this.editorial = editorial;
    }
}
