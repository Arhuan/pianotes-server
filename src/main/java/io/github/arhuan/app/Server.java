package io.github.arhuan.app;

import io.github.arhuan.app.enums.Clef;
import io.github.arhuan.app.model.Staff;

public class Server {

    public static void main(String[] args) {
        Staff staff = new Staff(Clef.TREBLE);
        staff.printNotes();
    }
}
