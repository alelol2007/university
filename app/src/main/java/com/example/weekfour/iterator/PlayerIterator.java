package com.example.weekfour.iterator;

import com.example.weekfour.iterator.CustomIterator;
import com.example.weekfour.model.Player;
import java.util.List;

public class PlayerIterator implements CustomIterator<Player> {
    private List<Player> players;
    private int position = 0;

    public PlayerIterator(List<Player> players) {
        this.players = players;
    }

    @Override
    public boolean hasNext() {
        return position < players.size();
    }

    @Override
    public Player next() {
        Player currentPlayer = players.get(position);
        position++;
        return currentPlayer;
    }
}