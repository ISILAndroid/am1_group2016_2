package com.isil.list.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.isil.list.R;
import com.isil.list.model.MovieEntity;

import java.util.List;

/**
 * Created by Profesor on 27/10/2016.
 */
public class MovieGridAdapter extends BaseAdapter {

    private Context context;
    private List<MovieEntity> data;

    public MovieGridAdapter(Context context, List<MovieEntity> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(this.context).
                    inflate(R.layout.row_movie_grid,parent,false);
        } else {
            view = convertView;
        }
        TextView tviTitle=(TextView)view.findViewById(R.id.tviName);
        ImageView iviCartelera= (ImageView)view.findViewById(R.id.iviCartelera);

        final MovieEntity movieEntity= data.get(position);

        tviTitle.setText(movieEntity.getTitle());
        boolean cartelera=movieEntity.isCartelera();
        if(cartelera){
            iviCartelera.setVisibility(View.VISIBLE);
        }else{
            iviCartelera.setVisibility(View.GONE);
        }
        return view;
    }
}
