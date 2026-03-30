package com.example.weekfour.repository;

import com.example.weekfour.model.Player;

import java.util.List;
import java.util.ArrayList;


public class PlayerRepository extends Repository<Player>{

    public List<Player> filterByTeam(String Team) {
        return this.filter(player -> player.getTeam().equals(Team));
    }
}
