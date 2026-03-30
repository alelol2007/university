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
import com.example.weekfour.model.Player;
import com.example.weekfour.model.Team;

public class PlayersFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getContext());

        DataProvider dataProvider = new DataProvider();
        CustomIterator<Player> iterator = dataProvider.getPlayerIterator();

        StringBuilder builder = new StringBuilder("Teams in Database:\n\n");
        while (iterator.hasNext()) {
            Player team = iterator.next();
            builder.append("⚽ ").append(team.getName())
                    .append(" (").append(team.getTeam()).append(")\n");
        }

        textView.setText(builder.toString());
        textView.setTextSize(20f);
        textView.setPadding(32, 32, 32, 32);

        return textView;
    }
}