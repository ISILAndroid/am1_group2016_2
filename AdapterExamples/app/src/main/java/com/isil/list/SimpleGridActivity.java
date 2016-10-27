package com.isil.list;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.widget.GridView;

import com.isil.list.adapter.MyGridAdapter;

import java.util.List;


public class SimpleGridActivity extends Activity {

    private List<ResolveInfo> mApps;
    private GridView mGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_grid);

        mGrid = (GridView) findViewById(R.id.myGrid);
        loadData();

        MyGridAdapter adapter= new MyGridAdapter(this,mApps);
        this.mGrid.setAdapter(adapter);
    }

    private void loadData() {
        Intent mainIntent = new Intent(Intent.ACTION_MAIN, null);
        mainIntent.addCategory(Intent.CATEGORY_LAUNCHER);
        mApps = getPackageManager().queryIntentActivities(mainIntent, 0);
    }

;
}
