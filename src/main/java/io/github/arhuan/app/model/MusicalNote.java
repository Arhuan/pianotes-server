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
        if (this.clef.equals(Clef.BASS)) {
            // only pick notes from octave 2 to 3 for bass notes
            this.octave = random.nextInt(2) + 2;
        } else {
            // only pick notes from octave 4 to 6 for treble notes
            this.octave = random.nextInt(3) + 4;
        }
    }
}
