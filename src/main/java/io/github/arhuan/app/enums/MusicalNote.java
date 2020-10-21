package io.github.arhuan.app.enums;

import io.github.arhuan.app.model.Note;

public class MusicalNote {

    private Note note;
    private int octave;

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
