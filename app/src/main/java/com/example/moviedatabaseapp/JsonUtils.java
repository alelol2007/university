package com.example.moviedatabaseapp;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JsonUtils {
    public static List<Movie> loadMovieFromJson(Context context){
        List<Movie> movies = new ArrayList<>();
        try {
            InputStream is = context.getAssets().open("movie_data.json");
            Scanner s = new Scanner(is).useDelimiter("\\A");
            String myText = s.hasNext() ? s.next(): "";
            JSONArray array = new JSONArray(myText);
            for (int i =0;i<array.length(); i++){
                JSONObject obj =array.getJSONObject(i);
                String movieTitle = obj.optString("title", "Unknown Title");
                int movieYear = obj.optInt("year", 0);
                String movieGenre = obj.optString("genre", "Unknown Genre");
                String moviePoster = obj.optString("poster", "");
                movies.add(new Movie(movieTitle,movieYear,movieGenre, moviePoster));
            }

        } catch (Exception e){
            handleException(e);
        }
        return movies;
    }
    private static void handleException(Exception e){
        e.printStackTrace();

    }
}
