package edu.sena.senaviwer.model;

public class Serie extends Film{
    int timeViewed;
    int sessionQuantity;

    public Serie(String title, String genre, int duration) {
        super(title, genre, duration);
        this.viewed = true;
    }


    public int getTimeViewed(){
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed){
        this.timeViewed = timeViewed;
    }

}

