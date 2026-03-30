package com.example.weekfour.iterator;
import com.example.weekfour.iterator.CustomIterator;
import com.example.weekfour.model.Match;
import java.util.List;

public class MatchIterator implements CustomIterator<Match> {
    private List<Match> matches;
    private int position = 0;

    public MatchIterator(List<Match> matches) {
        this.matches = matches;
    }

    @Override
    public boolean hasNext() {
        return position < matches.size();
    }

    @Override
    public Match next() {
        Match currentMatch = matches.get(position);
        position++;
        return currentMatch;
    }
}