package com.kyh.noteapp;

import androidx.cardview.widget.CardView;

import com.kyh.noteapp.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
