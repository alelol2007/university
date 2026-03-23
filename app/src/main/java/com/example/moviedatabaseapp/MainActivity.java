package com.example.moviedatabaseapp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView movieRecyclerView;
    private MovieAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        movieRecyclerView = findViewById(R.id.movieRecyclerView);
        setupRecyclerView();
        loadMovieData();

    }
    public void setupRecyclerView(){
        movieRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void loadMovieData(){
        List<Movie> movies = JsonUtils.loadMovieFromJson(this);
        if (movies.isEmpty()){
            showError("Error: No movies found or invalid JSON data!");
        } else{
            adapter = new MovieAdapter(movies);
            movieRecyclerView.setAdapter(adapter);
        }
    }
    public void showError(String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}