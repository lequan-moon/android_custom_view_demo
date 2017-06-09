package com.example.quanlm.android_custom_view_demo.listMovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.quanlm.android_custom_view_demo.R;
import com.example.quanlm.android_custom_view_demo.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class ActListMovies extends AppCompatActivity {
    RecyclerView rcvMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_list_movies);

        initControls();

    }

    private void initControls() {
        rcvMovies = (RecyclerView) findViewById(R.id.rcvMovies);
        List<Movie> lstMovies = new ArrayList<Movie>();
        lstMovies.add(new Movie("a1", "movie1", "movie description1"));
        lstMovies.add(new Movie("a2", "movie2", "movie description2"));
        lstMovies.add(new Movie("a3", "movie3", "movie description3"));
        lstMovies.add(new Movie("a4", "movie4", "movie description4"));
        lstMovies.add(new Movie("a5", "movie5", "movie description5"));
        lstMovies.add(new Movie("a6", "movie6", "movie description6"));
        lstMovies.add(new Movie("a7", "movie7", "movie description7"));
        lstMovies.add(new Movie("a8", "movie8", "movie description8"));
        lstMovies.add(new Movie("a9", "movie9", "movie description9"));
        lstMovies.add(new Movie("a10", "movie10", "movie description10"));

        RecyclerView.Adapter movieAdapter = new MovieAdaper(lstMovies, this);
        rcvMovies.setLayoutManager(new LinearLayoutManager(this));
        rcvMovies.setItemAnimator(new DefaultItemAnimator());
        rcvMovies.setAdapter(movieAdapter);
    }
}
