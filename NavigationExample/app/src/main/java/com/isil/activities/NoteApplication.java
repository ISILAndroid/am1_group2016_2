package com.isil.activities;

import android.app.Application;

import com.isil.activities.model.NoteEntity;
import com.isil.activities.storage.NoteRepository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by emedinaa on 29/10/15.
 */
public class NoteApplication extends Application {

    private NoteRepository noteRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        noteRepository= new NoteRepository();
        noteRepository.mock();
    }

    public NoteRepository getNoteRepository() {
        return noteRepository;
    }
}
