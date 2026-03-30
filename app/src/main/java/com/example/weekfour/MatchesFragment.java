package com.example.weekfour;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.weekfour.data.DataProvider;
import com.example.weekfour.iterator.CustomIterator;
import com.example.weekfour.model.Match;
import com.example.weekfour.model.Player;

public class MatchesFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getContext());

        DataProvider dataProvider = new DataProvider();
        CustomIterator<Match> iterator = dataProvider.getMatchIterator();

        StringBuilder builder = new StringBuilder("Teams in Database:\n\n");
        while (iterator.hasNext()) {
            Match team = iterator.next();
            builder.append("⚽ ").append(team.getMatchhalf())
                    .append(" vs (").append(team.getMatchfull()).append(")\n");
        }

        textView.setText(builder.toString());
        textView.setTextSize(20f);
        textView.setPadding(32, 32, 32, 32);

        return textView;
    }
}