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

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }
}
