package com.isil.list;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.isil.list.storage.Cheeses;
import com.isil.list.storage.Shakespeare;


public class SimpleListActivity extends Activity {


    private String[] mStrings = Cheeses.sCheeseStrings;
    private String[] mTitles= Shakespeare.TITLES;
    private String[] mDialogs= Shakespeare.DIALOGUE;
    private String[] mDays = {"Lunes", "Martes","Miercoles","Jueves","Viernes",
            "Sábado", "Domingo"};

    private ListView lviCheeses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        lviCheeses=(ListView)findViewById(R.id.lviCheeses);

        lviCheeses.setAdapter(new ArrayAdapter<String>(this,
                R.layout.my_row, mDays));
        lviCheeses.setTextFilterEnabled(true);

        //events
        lviCheeses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String value= String.valueOf(adapterView.getAdapter().getItem(position));
                showItem(value);
            }
        });
    }

    private void showItem(String value) {

        Toast.makeText(this,"item "+value,Toast.LENGTH_LONG).show();
    }

}
