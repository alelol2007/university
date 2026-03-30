package com.example.weekfour.model;

public class Match implements SoccerEntity{
    private String homeTeam;
    private String awayTeam;
    private String score;

    public Match(String homeTeam, String awayTeam, String score){
        this.homeTeam =homeTeam;
        this.awayTeam =awayTeam;
        this.score =score;
    }

    public String getMatchhalf(){ return this.homeTeam;}
    public String getMatchfull(){return this.awayTeam;}
    @Override
    public String getName() {
        return this.homeTeam + " vs " + this.awayTeam;
    }

    @Override
    public String getId() {
        return this.homeTeam + " vs " + this.awayTeam;
    }

}
