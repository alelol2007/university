package com.example.moviedatabaseapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
        private List<Movie> movieList;
        public MovieAdapter(List<Movie> movies) {
            this.movieList = movies;
        }

    @NonNull
    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
    return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieViewHolder holder, int position) {
        Movie currentMovie = movieList.get(position);
        holder.titleText.setText(currentMovie.getTitle());
        holder.yearText.setText(String.valueOf(currentMovie.getYear()));
        holder.genreText.setText(currentMovie.getGenre());
    }

    @Override
    public int getItemCount() {
        return movieList !=null?movieList.size():0;
    }
    public void updateMovies(List<Movie> newMovies){
            this.movieList = newMovies;
            notifyDataSetChanged();
    }
    static class MovieViewHolder extends RecyclerView.ViewHolder {
            TextView titleText, yearText, genreText;
            public  MovieViewHolder(@NonNull View itemView){
                super(itemView);
                titleText = itemView.findViewById(R.id.titleTextView);
                yearText = itemView.findViewById(R.id.yearTextView);
                genreText = itemView.findViewById(R.id.genreTextView);
            }

    }
}
