package edu.sena.senaviwer.model;

public class Chapter {
    int id;
    String title;
    int duration;
    int year;
    boolean viewed;
    int timeViwed;
    int sessionNumber;

    public Chapter(String title, int duration, int year){
        this.title = title;
        this.duration = duration;
        this.year = year;
    }
}
