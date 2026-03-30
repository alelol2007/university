package com.example.weekfour.repository;
import com.example.weekfour.model.Team;
import java.util.List;
import java.util.ArrayList;

public class TeamRepository extends Repository<Team>{

    public List<Team> filterByLeague(String league) {
        return this.filter(team -> team.getLeague().equals(league));
    }
}
