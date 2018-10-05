package com.realdolmen.examen.examenprogrammeren2jirkaruzicka;

public class Movie {
int id;
String title;
String genre;


public Movie() {
    }


   public Movie(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
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

    @Override
    public String toString() {
        return "Movie{ title: " + title +"/n" +", genre=" + genre + '}';
    }

 

}
