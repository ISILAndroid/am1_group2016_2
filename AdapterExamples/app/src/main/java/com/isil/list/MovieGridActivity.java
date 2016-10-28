package com.isil.list;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.isil.list.adapter.MovieAdapter;
import com.isil.list.adapter.MovieGridAdapter;
import com.isil.list.adapter.MovieObjAdapter;
import com.isil.list.adapter.SimpleListAdapter;
import com.isil.list.model.MovieEntity;
import com.isil.list.storage.Movies;

import java.util.List;

public class MovieGridActivity extends Activity {

    private GridView myGrid;
    private MovieGridAdapter movieAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_grid);

        myGrid=(GridView) findViewById(R.id.myGrid);


        Movies movies= new Movies();
        List<MovieEntity> data= movies.getMovieEntityList();

        movieAdapter= new MovieGridAdapter(this,
                data);
        myGrid.setAdapter(movieAdapter);

    }
}
