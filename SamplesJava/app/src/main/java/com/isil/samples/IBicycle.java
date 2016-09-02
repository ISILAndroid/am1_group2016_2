package com.isil.samples;

/**
 * Created by Profesor on 01/09/2016.
 */
public interface IBicycle {

    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
