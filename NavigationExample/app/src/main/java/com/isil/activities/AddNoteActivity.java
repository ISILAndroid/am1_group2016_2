package com.isil.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.isil.activities.model.NoteEntity;

import java.util.Calendar;

public class AddNoteActivity extends Activity {

    private Button btnAddNote;
    private EditText eteName;
    private EditText eteDesc;
    private EditText eteNote;

    private String name,desc,note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnote);

        btnAddNote= (Button)findViewById(R.id.btnAddNote);
        eteName= (EditText)findViewById(R.id.eteName);
        eteDesc= (EditText)findViewById(R.id.eteDesc);
        eteNote= (EditText)findViewById(R.id.eteNote);

        btnAddNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNote();
                gotoMain();
            }
        });
    }

    private void gotoMain() {
        finish();
    }

    private void addNote() {

        NoteApplication application= (NoteApplication)getApplication();

        name= eteName.getText().toString().trim();
        desc= eteDesc.getText().toString().trim();
        note= eteNote.getText().toString().trim();

        Calendar calendar= Calendar.getInstance();
        String ndate= ""+calendar.getTime();
        NoteEntity last= application.getNoteRepository().lastNote();
        int noteId;
        if(last!=null)
        {
            noteId= last.getId()+1;
        }else
        {
            noteId=1;
        }
        NoteEntity noteEntity= new NoteEntity(noteId,name,desc,ndate);
        noteEntity.setIcon(R.drawable.ic_note);
        application.getNoteRepository().addNote(noteEntity);
    }
}
