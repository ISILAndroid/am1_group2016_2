package com.isil.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.isil.activities.model.Place;
import com.isil.activities.utils.StringUtils;

import org.w3c.dom.Text;

public class PlaceActivity extends AppCompatActivity {


    private ImageView iviPlace;
    private TextView tviTitle;
    private TextView tviDesc;
    private View flayHeader;
    private TextView tviNick;
    private Place place;
    private StringUtils stringUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        stringUtils= new StringUtils();
        extras();
        ui();
        populate();
    }

    private void populate() {
        if(place==null)return;

        String nick= place.getNick();
        nick= stringUtils.firstCapitalize(nick);
        tviTitle.setText(place.getTitle());
        tviNick.setText(nick);
        tviDesc.setText(place.getDesc());
        flayHeader.setBackgroundColor(Color.parseColor(place.getHeaderColor()));
        iviPlace.setImageResource(place.getPhoto());
    }

    private void ui() {
        iviPlace= (ImageView)findViewById(R.id.iviPlace);
        tviTitle= (TextView) findViewById(R.id.tviTitle);
        tviDesc= (TextView) findViewById(R.id.tviDesc);
        flayHeader=  findViewById(R.id.flayHeader);
        tviNick=  (TextView) findViewById(R.id.tviNick);
    }

    private void extras() {
        if (getIntent() != null) {
            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                place = (Place) bundle.getSerializable("PLACE");
            }
        }
    }
}
