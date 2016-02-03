package com.example.estacionvl_tc_014.cinestar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.estacionvl_tc_014.cinestar.Adapters.MovieAdapter;
import com.example.estacionvl_tc_014.cinestar.Models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView list;

    List<Movie> data;
    MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        data = new ArrayList<>();
        adapter = new MovieAdapter(this,data);
        list.setAdapter(adapter);

        loadMovies();
    }

    public void loadMovies(){

        Movie p1 = new Movie();
        Movie p2 = new Movie();
        Movie p3 = new Movie();
        Movie p4 = new Movie();

        p1.setName("Revenant");
        p1.setLengthm("1:15:45");
        p1.setRating(8.4f);
        p1.setUrl("http://cuevana-latino.com/wp-content/uploads/2016/01/MV5BMjU4NDExNDM1NF5BMl5BanBnXkFtZTgwMDIyMTgxNzE%40._V1_SX3001.jpg");

        p2.setName("Mediterraneo");
        p2.setLengthm("1:10:20");
        p2.setRating(7.2f);
        p2.setUrl("http://www.fotogramas.es/var/ezflow_site/storage/images/peliculas/mediterraneo/27242-1-esl-ES/Mediterraneo1_cartel.jpg");

        p3.setName("Amelie");
        p3.setLengthm("1:20:37");
        p3.setRating(6.9f);
        p3.setUrl("http://www.cb01.co/imgk/il%20favoloso%20mondo%20di%20amelie.jpg");

        p4.setName("Dances with Wolves");
        p4.setLengthm("2:05:13");
        p4.setRating(8.0f);
        p4.setUrl("http://www.yifysubtitles.com/images/movies/movie-1922.jpg");

        data.add(p1);
        data.add(p2);
        data.add(p3);
        data.add(p4);

        adapter.notifyDataSetChanged();
    }


}
