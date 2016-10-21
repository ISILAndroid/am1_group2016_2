package com.isil.events;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormActivity extends Activity {

    private EditText eteUser, eteEmail, eteName, etePassword,
    eteCPassword;

    private String name, email, userName,password, cpassword;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        eteUser = (EditText)findViewById(R.id.eteUser);
        eteEmail = (EditText)findViewById(R.id.eteEmail);
        eteName = (EditText)findViewById(R.id.eteName);
        etePassword = (EditText)findViewById(R.id.etePassword);
        eteCPassword = (EditText)findViewById(R.id.eteCPassword);

        btnSignUp= (Button)findViewById(R.id.btnSignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("CONSOLE", "click");

                if(validate()){
                    Toast.makeText(FormActivity.this,"Enviando al servidor..",
                            Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(FormActivity.this,"Campos inválidos..",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validate(){
        name= eteName.getText().toString().trim();
        email= eteEmail.getText().toString().trim();
        userName= eteUser.getText().toString().trim();
        password= etePassword.getText().toString().trim();
        cpassword= eteCPassword.getText().toString().trim();
        clear();
        if(name.isEmpty()){
            eteName.setError("Campo inválido");
            return false;
        }
        if(email.isEmpty()){
            eteEmail.setError("Campo inválido");
            return false;
        }
        if(userName.isEmpty()){
            eteUser.setError("Campo inválido");
            return false;
        }
        if(password.isEmpty())return false;
        if(cpassword.isEmpty())return false;

        if(!isEmailValid(email)){
            eteEmail.setError("Email inválido");
            return false;
        }

        if(!password.equals(cpassword)){
            etePassword.setError("Password no coincide");
            return false;
        }
        return true;
    }

    private void clear() {
        eteName.setError(null);
        etePassword.setError(null);
        eteEmail.setError(null);
        eteUser.setError(null);
        eteCPassword.setError(null);
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
}
