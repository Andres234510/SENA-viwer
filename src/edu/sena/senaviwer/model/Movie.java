package edu.sena.senaviwer.model;

public class Movie {
    int id;
    String title;
    String genre;
    String creator;
    int duration;
    int year;
    boolean viewed;
    int timeviwed;

    public Movie(String title, String genre, String creator, int  duration, short year){
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
        this.viewed = true;
        this.timeviwed = 0;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public int getTimeViewed() {
        return timeviwed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeviwed = timeViewed;
    }
}
