package com.example.weekfour.iterator;

import com.example.weekfour.iterator.CustomIterator;
import com.example.weekfour.model.Team;
import java.util.List;
public class TeamIterator implements CustomIterator<Team> {
    private List<Team> teams;
    private int position = 0;
    public TeamIterator(List<Team> teams) {
        this.teams = teams;
    }
    @Override
    public boolean hasNext() {
        return position < teams.size();    }

    @Override
    public Team next() {
        Team currentTeam = teams.get(position);
        position++;
        return currentTeam;
    }
}