package io.github.arhuan.app.model;

import io.github.arhuan.app.enums.Clef;

import java.util.LinkedList;
import java.util.List;

public class Staff {

    private List<MusicalNote> notes;
    private Clef clef;

    public Staff(Clef clef) {
        this.notes = new LinkedList<>();
        this.clef = clef;
    }

    public void printNotes() {
        // TODO: Add logic to print notes;
        System.out.println("     ");
        System.out.println("-----");
        System.out.println("     ");
        System.out.println("-----");
        System.out.println("     ");
        System.out.println("-----");
        System.out.println("     ");
        System.out.println("-----");
        System.out.println("     ");
        System.out.println("-----");
        System.out.println("     ");
    }

    public void addNote(MusicalNote note) {
        notes.add(note);
    }

    public void setNotes(List<MusicalNote> notes) {
        this.notes = notes;
    }

    public List<MusicalNote> getNotes() {
        return notes;
    }
}
