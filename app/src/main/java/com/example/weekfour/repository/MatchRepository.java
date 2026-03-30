package com.example.weekfour.repository;
import com.example.weekfour.model.Match;
import java.util.List;
import java.util.ArrayList;

public class MatchRepository extends Repository<Match> {

    public List<Match> filterByTeam(String teamName) {
        return this.filter(match ->
                match.getMatchhalf().equals(teamName) || match.getMatchfull().equals(teamName)
        );
    }
}