package com.isil.activities;

import android.app.Application;

import com.isil.activities.model.NoteEntity;
import com.isil.activities.storage.NoteRepository;
import com.isil.activities.storage.PlaceRepository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by emedinaa on 29/10/15.
 */
public class NoteApplication extends Application {

    private NoteRepository noteRepository;
    private PlaceRepository placeRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        noteRepository= new NoteRepository();
        noteRepository.mock();

        placeRepository= new PlaceRepository();
        placeRepository.mock();
    }

    public NoteRepository getNoteRepository() {
        return noteRepository;
    }

    public PlaceRepository getPlaceRepository() {
        return placeRepository;
    }
}
