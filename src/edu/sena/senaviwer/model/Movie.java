package edu.sena.senaviwer.model;

public class Movie extends Film{

    int timeviwed;

    public Movie(String title, String genre, String creator, int  duration, short year){
        super(title, genre, creator, duration, year);
        this.timeviwed = 0;
    }

    public int getTimeViewed() {
        return timeviwed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeviwed = timeViewed;
    }
}
