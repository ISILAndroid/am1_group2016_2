package com.isil.examplesandroidjava;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {


    private EditText eteName,eteEmail,etePassword1,etePassword2;
    private Button butSignUp;

    private String name, email,password1, password2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ui();
    }

    private void ui() {

        eteName= (EditText)findViewById(R.id.eteName);
        eteEmail= (EditText)findViewById(R.id.eteEmail);
        etePassword1= (EditText)findViewById(R.id.etePassword1);
        etePassword2= (EditText)findViewById(R.id.etePassword2);

        butSignUp = (Button)findViewById(R.id.butSignUp);

        butSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateForm()) {
                    //enviar al servidor
                    //Toast.makeText(getActivity(),"Enviando al servidor",Toast.LENGTH_LONG).show();
                    showMessage();
                }
            }
        });
    }


    private boolean validateForm() {

        name = eteName.getText().toString().trim();
        email = eteEmail.getText().toString().trim();
        password1 = etePassword1.getText().toString().trim();
        password2 = etePassword2.getText().toString().trim();
        clear();

        if (name.equals("")) {
            eteName.setError("Ingresar el nombre");
            return false;
        }
        if (email.isEmpty()) {
            eteEmail.setError("Ingresar el email");
            return false;
        }
        if (!isEmailValid(email))
        {
            eteEmail.setError("Email inválido");
            return false;
        }
        if(password1.isEmpty())
        {
            etePassword1.setError("Ingresar el password");
            return false;
        }

        if(password2.isEmpty())
        {
            etePassword2.setError("Ingresar el password");
            return false;
        }
        if(!password1.equals(password2))
        {
            etePassword2.setError("No conciden las contraseñas");
            return false;
        }

        return true;
    }

    public boolean isEmailValid(String email) {
        String regExpn =
                "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                        +"((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                        +"([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                        +"([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$";

        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);

        if(matcher.matches())
            return true;
        else
            return false;
    }

    private void clear() {
        eteName.setError(null);
        eteEmail.setError(null);
        etePassword1.setError(null);
        etePassword2.setError(null);
    }

    private void showMessage() {


        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("")
                .setMessage("Enviar al servidor...")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });

        AlertDialog dialog= builder.create();
        dialog.show();
    }
}
