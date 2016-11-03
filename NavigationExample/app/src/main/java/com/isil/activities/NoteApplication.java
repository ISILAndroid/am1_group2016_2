package com.isil.activities;

import android.app.Application;

import com.isil.activities.model.NoteEntity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by emedinaa on 29/10/15.
 */
public class NoteApplication extends Application {

    private List<NoteEntity> lsNoteEntities;

    @Override
    public void onCreate() {
        super.onCreate();
        lsNoteEntities= new ArrayList<NoteEntity>();

        Calendar calendar= Calendar.getInstance();
        String ndate= ""+calendar.getTime();

        NoteEntity noteEntity= new NoteEntity(1,"Nota 1","Esta es una nota",ndate);
        noteEntity.setIcon(R.drawable.ic_note);
        NoteEntity noteEntity1= new NoteEntity(2,"Nota 2","Esta es una nota",ndate);
        noteEntity1.setIcon(R.drawable.ic_note);
        NoteEntity noteEntity2= new NoteEntity(3,"Nota 3","Esta es una nota",ndate);
        noteEntity2.setIcon(R.drawable.ic_note);
        NoteEntity noteEntity3= new NoteEntity(4,"Nota 4","Esta es una nota",ndate);
        noteEntity3.setIcon(R.drawable.ic_note);

        lsNoteEntities.add(noteEntity);
        lsNoteEntities.add(noteEntity1);
        lsNoteEntities.add(noteEntity2);
        lsNoteEntities.add(noteEntity3);

    }

    public void addNote(NoteEntity noteEntity)
    {
        lsNoteEntities.add(noteEntity);
    }

    public void removeNote(NoteEntity noteEntity)
    {
        this.lsNoteEntities.remove(noteEntity);
    }

    public void removeNoteById(int noteId)
    {
        int position=-1;
        NoteEntity note;
        for (int i = 0; i <this.lsNoteEntities.size() ; i++)
        {
            note= lsNoteEntities.get(i);
            if(note.getId()==noteId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position<lsNoteEntities.size())
        {
            this.lsNoteEntities.remove(position);
        }
    }

    public void updateNote(int position, NoteEntity noteEntity)
    {
        if(position<lsNoteEntities.size())
        {
            lsNoteEntities.set(position, noteEntity);
        }
    }
    public void updateNoteById(int noteId, NoteEntity noteEntity)
    {
        int position=-1;
        NoteEntity note;
        for (int i = 0; i <this.lsNoteEntities.size() ; i++) {
            note= lsNoteEntities.get(i);
            if(note.getId()==noteId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position<lsNoteEntities.size())
        {
            this.lsNoteEntities.set(position, noteEntity);
        }
    }


    public List<NoteEntity> allNotes()
    {
        return this.lsNoteEntities;
    }

    public int countNotes()
    {
        return this.lsNoteEntities.size();
    }
    public NoteEntity lastNote()
    {
        if(this.lsNoteEntities.size()>0)
        {
            return this.lsNoteEntities.get(this.lsNoteEntities.size()-1);
        }
        return null;
    }


}
