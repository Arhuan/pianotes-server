package io.github.arhuan.app.model;

import lombok.Getter;

import java.util.Random;

@Getter
public class MusicalNote {

    private final Note note;
    private final Clef clef;
    private final int octave;

    public MusicalNote() {
        Random random = new Random();

        this.note = Note.randomNote();
        this.clef = Clef.randomClef();
        this.octave = random.nextInt(9);
    }
}
