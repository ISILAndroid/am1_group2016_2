package com.isil.samples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        //initInherance();
        //initInterfaces();
    }

    private void initInherance() {

        Bicycle bike1 = new Bicycle();
        MountainBike mountainBike = new MountainBike();

        bike1.printStates();

        mountainBike.printStates();
    }

    private void initInterfaces() {

        ACMEBicycle bike1 = new ACMEBicycle();
        bike1.printStates();
    }

    private void init() {

        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);


        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);

        bike1.printStates();
        bike2.printStates();
    }
}
