package com.example.weekfour.model;

public class Player  implements SoccerEntity{
    private String name;
    private String position;
    private  String team;

    public Player(String name, String position, String team){
        this.name = name;
        this.position = position;
        this. team = team;
    }

    @Override
    public String getId(){
        return this.name;
    }

    @Override
    public String getName(){
        return this.name;
    }
    public String getTeam(){
        return this.team;
    }

}
