package com.example.weekfour.model;

public class Team implements SoccerEntity{
    private String name;
    private String country;
    private String league;

    public Team(String name, String country, String league){
        this.name = name;
        this.country = country;
        this.league = league;
    }

    @Override
    public  String getId(){
        return this.name;
    }

    @Override
    public String getName(){
        return this.name;
    }


    public String getLeague(){
        return this.league;
    }


}
