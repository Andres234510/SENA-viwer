package edu.sena.senaviwer.model;

public class Serie {
    int id;
    String title;
    String genre;
    String creator;
    int duration;
    int year;
    boolean viewed;
    int timeViewed;
    int sessionQuantity;

    public Serie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
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

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getCreator(){
        return creator;
    }

    public void setCreator(String creator){
        this.creator = creator;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public int getyear(){
        return year;
    }

    public void setYear(int year){
        this.year = year ;
    }

    public boolean getviewed(){
        return viewed;
    }

    public void setViewed(boolean viewed){
        this.viewed =viewed;
    }

    public int getTimeViewed(){
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed){
        this.timeViewed = timeViewed;
    }

    public int getSessionQuantity(){
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity){
        this.sessionQuantity = sessionQuantity;
    }

}

