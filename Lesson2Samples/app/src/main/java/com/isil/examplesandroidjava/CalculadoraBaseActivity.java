package com.isil.examplesandroidjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraBaseActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "CalculadoraBaseA";
    private EditText editTextOp1;
    private EditText editTextOp2;
    private TextView tviOp;

    private View iviSum,iviSubtract,iviMultiply,iviDivide;

    private int op1,op2,op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        ui();
    }

    private void ui() {

        editTextOp1= (EditText)findViewById(R.id.editTextOp1);
        editTextOp2= (EditText)findViewById(R.id.editTextOp2);
        tviOp= (TextView)findViewById(R.id.tviOp);

        iviSum= findViewById(R.id.iviSum);
        iviSubtract= findViewById(R.id.iviSubtract);
        iviMultiply= findViewById(R.id.iviMultiply);
        iviDivide= findViewById(R.id.iviDivide);

        iviSum.setOnClickListener(this);
        iviSubtract.setOnClickListener(this);
        iviMultiply.setOnClickListener(this);
        iviDivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //TODO capturar valores

        //TODO operaciones
        switch (v.getId())
        {
            case R.id.iviSum:
                Log.v(TAG, "sumar");
                break;

            case R.id.iviSubtract:
                Log.v(TAG, "restar");
                break;

            case R.id.iviMultiply:
                Log.v(TAG, "multiplicar");
                break;

            case R.id.iviDivide:
                Log.v(TAG, "dividir");
                break;

        }

        //TODO mostrar resultados
        tviOp.setText("Resultado ");

    }

}
