package com.isil.activities.view.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.isil.activities.R;
import com.isil.activities.model.Place;
import com.isil.activities.utils.StringUtils;

import java.util.List;

/**
 * Created by emedinaa on 15/09/15.
 */
public class PlaceAdapter extends BaseAdapter  {

    private int DESCLMAX=30;
    private Context context;
    private List<Place> places;
    private StringUtils stringUtils;


    public PlaceAdapter(Context context, List<Place> places) {
        this.context = context;;
        this.places = places;
        this.stringUtils= new StringUtils();
    }

    @Override
    public int getCount() {
        return places.size();
    }

    @Override
    public Object getItem(int i) {
        return places.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if(v == null)
        {
            LayoutInflater inflater = LayoutInflater.from(context);
            v = inflater.inflate(R.layout.row_place, null);
            ViewHolder holder = new ViewHolder();
            holder.iviPlace = (ImageView) v.findViewById(R.id.iviPlace);
            holder.tviNick = (TextView) v.findViewById(R.id.tviNick);
            holder.tviTitle = (TextView) v.findViewById(R.id.tviTitle);
            holder.tviDesc = (TextView) v.findViewById(R.id.tviDesc);
            v.setTag(holder);
        }
        Place entry = places.get(position);
        if(entry != null)
        {
            ViewHolder holder = (ViewHolder)v.getTag();
            String nick=entry.getNick();
            String desc= entry.getDesc();
            nick= stringUtils.first(nick).toUpperCase();
            if(desc.length()>=DESCLMAX) desc= desc.substring(0,DESCLMAX)+"...";
            holder.tviNick.setText(nick);
            holder.tviTitle.setText(entry.getTitle());
            holder.tviDesc.setText(desc);
            holder.iviPlace.setImageResource(entry.getPhoto());

            holder.tviNick.setBackgroundColor(Color.parseColor(entry.getHeaderColor()));
        }

        return v;
    }


    static class ViewHolder
    {
        ImageView iviPlace;
        TextView tviNick;
        TextView tviTitle;
        TextView tviDesc;
    }
}