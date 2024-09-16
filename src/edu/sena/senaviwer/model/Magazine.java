package edu.sena.senaviwer.model;

public class Magazine extends Publication{
    int id;

    public Magazine(String title, String editorialDate, String editorial){
        super(title, editorialDate, editorial);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getRead() {
        return true;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", title='" + getTitle() + '\'' +
                ", editorialDate='" + getEditorialDate() + '\'' +
                ", editorial='" + getEditorial() + '\'' +
                ", read=" + (getRead() ? "Yes" : "No") +
                '}';
    }
}
