package com.isil.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.isil.activities.model.NoteEntity;

import java.util.Timer;
import java.util.TimerTask;


public class SplashActivity extends Activity {

    private static final long SPLASH_SCREEN_DELAY = 6000;//4segundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask task = new TimerTask()
        {
            @Override
            public void run() {

                //Actividad inicial, Siguiente Actividad
                Intent intent = new Intent(SplashActivity.this,
                        LoginActivity.class);
                startActivity(intent);
                finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }

    private void extras(){
        if(getIntent()!=null && getIntent().getExtras()!=null){
            Bundle bundle = getIntent().getExtras();
            NoteEntity noteEntity= (NoteEntity) bundle.getSerializable("ENTITY");
        }
    }


}
