package io.github.arhuan.app;

import io.github.arhuan.app.enums.Clef;
import io.github.arhuan.app.model.MusicalNote;
import io.github.arhuan.app.model.Staff;

import java.util.ArrayList;
import java.util.List;

public class Server {

    public static void main(String[] args) {
        Staff staff = new Staff(Clef.TREBLE);

        List<MusicalNote> notes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            notes.add(new MusicalNote());
        }

        staff.setNotes(notes);
        staff.printNotes();
    }
}
