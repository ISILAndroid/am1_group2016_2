package com.isil.list;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ui();
    }

    private void ui() {
        findViewById(R.id.btnSimpleList).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSimpleList();
            }
        });

        findViewById(R.id.btnSimpleGrid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSimpleGrid();
            }
        });

        findViewById(R.id.btnCustomList).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCustomList();
            }
        });


        findViewById(R.id.btnViewHolder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        findViewById(R.id.btnMoviegrid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoMoviewGrid();
            }
        });
    }

    private void gotoMoviewGrid() {
        startActivity(new Intent(this,MovieGridActivity.class));
    }

    private void gotoSimpleList() {
        startActivity(new Intent(this,SimpleListActivity.class));
    }

    private void gotoSimpleGrid() {
        startActivity(new Intent(this,SimpleGridActivity.class));
    }

    private void gotoCustomList() {
        startActivity(new Intent(this,CustomListActivity.class));
    }

}
