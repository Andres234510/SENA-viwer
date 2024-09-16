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
        this.viewed = true;
        this.timeViwed = 0;
        this.sessionNumber = 1;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean viewed() {
        return true;
    }

    public int getTimeViewed() {
        return timeViwed;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", year=" + year +
                ", viewed=" + (viewed ? "Yes" : "No") +
                ", timeViewed=" + timeViwed + " minutes" +
                ", sessionNumber=" + sessionNumber +
                '}';
    }


}
