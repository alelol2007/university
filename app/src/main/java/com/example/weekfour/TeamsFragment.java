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
import com.example.weekfour.model.Team;

public class TeamsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getContext());

        DataProvider dataProvider = new DataProvider();
        CustomIterator<Team> iterator = dataProvider.getTeamIterator();

        StringBuilder builder = new StringBuilder("Teams in Database:\n\n");
        while (iterator.hasNext()) {
            Team team = iterator.next();
            builder.append("⚽ ").append(team.getName())
                    .append(" (").append(team.getLeague()).append(")\n");
        }

        textView.setText(builder.toString());
        textView.setTextSize(20f);
        textView.setPadding(32, 32, 32, 32);

        return textView;
    }
}