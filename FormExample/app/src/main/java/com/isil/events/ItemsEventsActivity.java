package com.isil.events;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class ItemsEventsActivity extends Activity {

    private Spinner spLocation;
    private String localidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_events);
        ui();
    }

    private void ui() {
        spLocation =(Spinner)findViewById(R.id.spLocation);

        spLocation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.v("CONSOLE", "spLocation" + adapterView.getAdapter().getItem(i));
                localidad = adapterView.getAdapter().getItem(i).toString();
                Toast.makeText(ItemsEventsActivity.this,
                        "Item seleccionado "+localidad,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
