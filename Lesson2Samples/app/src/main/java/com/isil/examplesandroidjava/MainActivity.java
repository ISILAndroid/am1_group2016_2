package com.isil.examplesandroidjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View tviCalculadora;
    private View tviRegistro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ui();
    }

    private void ui() {
        tviCalculadora= findViewById(R.id.tviCalculadora);
        tviRegistro= findViewById(R.id.tviRegistro);

        tviCalculadora.setOnClickListener(this);
        tviRegistro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tviCalculadora:
                    gotoCalculadora();
                break;

            case R.id.tviRegistro:
                    gotoRegistro();
                break;
        }
    }

    private void gotoRegistro() {
        startActivity(new Intent(this,RegisterActivity.class));
    }

    private void gotoCalculadora() {
        startActivity(new Intent(this,CalculadoraActivity.class));
    }

}
