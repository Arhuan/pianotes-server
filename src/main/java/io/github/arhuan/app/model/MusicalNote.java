package io.github.arhuan.app.model;

import io.github.arhuan.app.enums.Note;

import java.util.Random;

public class MusicalNote {

    private Note note;
    private int octave;

    public MusicalNote() {
        Random random = new Random();

        this.note = Note.randomNote();
        this.octave = random.nextInt(9);
    }

    public MusicalNote(Note note) {
        Random random = new Random();

        this.note = note;
        this.octave = random.nextInt(9);
    }

    public MusicalNote(int octave) {
        this.note = Note.randomNote();
        this.octave = octave;
    }

    public MusicalNote(Note note, int octave) {
        this.note = note;
        this.octave = octave;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public void setOctave(int octave) {
        this.octave = octave;
    }

    public Note getNote() {
        return note;
    }

    public int getOctave() {
        return octave;
    }
}
