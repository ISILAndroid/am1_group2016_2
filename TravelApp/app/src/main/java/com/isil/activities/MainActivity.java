package com.isil.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.isil.activities.model.Place;
import com.isil.activities.view.adapters.PlaceAdapter;

import java.util.List;

public class MainActivity extends Activity {

    private ListView lstPlace;
    private List<Place> places;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        app();

    }

    private void app() {
        ui();
        events();
    }

    @Override
    protected void onResume() {
        super.onResume();
        populate();
    }

    private void populate() {
        PlaceAdapter placeAdapter= new PlaceAdapter(this,places );
        lstPlace.setAdapter(placeAdapter);
    }

    private void loadData() {

        NoteApplication application= (NoteApplication)getApplication();
        this.places= application.getPlaceRepository().allPlaces();
    }

    private void ui() {
        lstPlace= (ListView)findViewById(R.id.lstPlace);
    }

    private void events() {

        lstPlace.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Place place= (Place) adapterView.getAdapter().getItem(position);
                gotoPlaceDetail(place);

            }
        });
    }

    private void gotoPlaceDetail(Place place) {
        Bundle bundle= new Bundle();
        bundle.putSerializable("PLACE",place);

        Intent intent = new Intent(MainActivity.this, PlaceActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }


}
