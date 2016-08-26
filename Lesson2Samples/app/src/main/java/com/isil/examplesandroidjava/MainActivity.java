package com.isil.examplesandroidjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View tviCalculadora, tviCalculadoraB;
    private View tviRegistro,tviRegistroB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ui();
    }

    private void ui() {
        tviCalculadora= findViewById(R.id.tviCalculadora);
        tviRegistro= findViewById(R.id.tviRegistro);

        tviCalculadoraB= findViewById(R.id.tviCalculadoraB);
        tviRegistroB= findViewById(R.id.tviRegistroB);

        tviCalculadora.setOnClickListener(this);
        tviRegistro.setOnClickListener(this);
        tviCalculadoraB.setOnClickListener(this);
        tviRegistroB.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tviCalculadora:
                    gotoCalculadora();
                break;
            case R.id.tviCalculadoraB:
                    gotoCalculadoraB();
                break;

            case R.id.tviRegistro:
                    gotoRegistro();
                break;
            case R.id.tviRegistroB:
                    gotoRegistroB();
                break;
        }
    }

    private void gotoRegistro() {
        startActivity(new Intent(this,RegisterActivity.class));
    }

    private void gotoRegistroB() {
        startActivity(new Intent(this,RegisterBaseActivity.class));
    }

    private void gotoCalculadora() {
        startActivity(new Intent(this,CalculadoraActivity.class));
    }

    private void gotoCalculadoraB() {
        startActivity(new Intent(this,CalculadoraBaseActivity.class));
    }

}
