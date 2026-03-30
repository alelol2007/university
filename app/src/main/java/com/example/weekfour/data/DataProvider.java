package com.example.weekfour.data;

import com.example.weekfour.iterator.PlayerIterator;
import com.example.weekfour.iterator.MatchIterator;
import com.example.weekfour.iterator.TeamIterator;
import com.example.weekfour.model.Match;
import com.example.weekfour.model.Player;
import com.example.weekfour.model.Team;
import com.example.weekfour.repository.TeamRepository;

import com.example.weekfour.repository.PlayerRepository;

import com.example.weekfour.repository.MatchRepository;

import com.example.weekfour.iterator.CustomIterator;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private TeamRepository teamRepository;
    private PlayerRepository playerRepository;
    private MatchRepository matchRepository;

    public DataProvider() {
        this.teamRepository = new TeamRepository();
        this.playerRepository = new PlayerRepository();
        this.matchRepository = new MatchRepository();

            for (Team t : createSampleTeams())
            { this.teamRepository.add(t); }
            for (Player p : createSamplePlayers())
            { this.playerRepository.add(p); }
            for (Match m : createSampleMatch())
            {
                this.matchRepository.add(m); }
        }

    public List<Team> createSampleTeams(){
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("hola", "bogota", "chinatown"));
        teams.add(new Team("haal", "vhu", "ffff"));

        return teams;
    }

    public List<Player> createSamplePlayers(){
        List<Player> players = new ArrayList<>();
        players.add(new Player("fernando", "bogota", "chinatown"));
        return players;
    }

    public List<Match> createSampleMatch(){
        List<Match> matches = new ArrayList<>();
        matches.add(new Match("france", "china", "chinatown"));
        return matches;
    }

    public CustomIterator<Team> getTeamIterator() {
        return new TeamIterator(teamRepository.getAll());
    }
    public CustomIterator<Player> getPlayerIterator() {
        return new PlayerIterator(playerRepository.getAll());
    }

    public CustomIterator<Match> getMatchIterator() {
        return new MatchIterator(matchRepository.getAll());
    }
}