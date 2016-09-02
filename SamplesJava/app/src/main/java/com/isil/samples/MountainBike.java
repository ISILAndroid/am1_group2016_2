package com.isil.samples;

/**
 * Created by Profesor on 01/09/2016.
 */
public class MountainBike extends Bicycle {

    @Override
    public void printStates() {
        System.out.println("MountainBike cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
