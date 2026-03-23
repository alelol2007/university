package com.example.moviedatabaseapp;

public class Movie {
    private String title;
    private int year;
    private String genre;

    private String postResource;
    public Movie(String title, Integer year, String genre, String posterResource){
        if (title== null|| title.isEmpty()){
            this.title="Unkown Title";
        } else {
            this.title=title;
        }
        if (year == null){
            this.year=0;
        } else {
            this.year=year;
        }
        if (genre == null || genre.isEmpty()) {
            this.genre = "Unknown Genre";
        } else {
            this.genre = genre;
        }
        if (posterResource==null|| posterResource.isEmpty()){
            this.postResource="Unknown poster";
        } else {
            this.postResource = posterResource;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }
    public String getPosterResource(){
        return  postResource;
    }
}
