package com.isil.list;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.isil.list.adapter.MovieAdapter;
import com.isil.list.adapter.SimpleListAdapter;
import com.isil.list.storage.Cheeses;
import com.isil.list.storage.Movies;


public class CustomListActivity extends Activity {

    //private String[] mStrings = Cheeses.sCheeseStrings;
    private String[] mStrings = Movies.DATA;
    private ListView lviCheeses;
    private SimpleListAdapter adapter;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        lviCheeses=(ListView)findViewById(R.id.lviCheeses);

        //adapter= new SimpleListAdapter(this,mStrings);

        //lviCheeses.setAdapter(adapter);

        movieAdapter= new MovieAdapter(this,mStrings);
        lviCheeses.setAdapter(movieAdapter);
    }
}
