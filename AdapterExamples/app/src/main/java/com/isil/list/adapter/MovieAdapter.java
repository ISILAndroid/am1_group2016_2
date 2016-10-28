package com.isil.list.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.isil.list.R;

/**
 * Created by Profesor on 27/10/2016.
 */
public class MovieAdapter extends BaseAdapter{

    private String[] movies;
    private Context context;

    public MovieAdapter(Context context, String[]movies) {
        this.movies = movies;
        this.context= context;
    }

    @Override
    public int getCount() {
        return this.movies.length;
    }

    @Override
    public Object getItem(int position) {
        return movies[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(this.context).inflate(R.layout.row_movie,parent,false);
        } else {
            view = convertView;
        }
        TextView tviTitle=(TextView)view.findViewById(R.id.tviName);
        tviTitle.setText(movies[position]);
        if(position==0){
            tviTitle.setTextColor(Color.GREEN);
        }else{
            tviTitle.setTextColor(Color.BLACK);
        }

        return view;
    }
}
