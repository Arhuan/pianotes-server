package io.github.arhuan.app.model;

import io.github.arhuan.app.enums.Clef;
import io.github.arhuan.app.enums.Note;

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
        String line0 = "";
        String line1 = "";
        String line2 = "";
        String line3 = "";
        String line4 = "";
        String line5 = "";
        String line6 = "";
        String line7 = "";
        String line8 = "";
        String line9 = "";
        String line10 = "";

        for (MusicalNote note : notes) {
            switch (note.getNote()) {
                case A:
                    line0 = line0.concat("     ");
                    line1 = line1.concat("-----");
                    line2 = line2.concat("     ");
                    line3 = line3.concat("-----");
                    line4 = line4.concat("     ");
                    line5 = line5.concat("-----");
                    line6 = line6.concat("  O  ");
                    line7 = line7.concat("-----");
                    line8 = line8.concat("     ");
                    line9 = line9.concat("-----");
                    line10 = line10.concat("     ");
                    break;
                case B:
                    line0 = line0.concat("     ");
                    line1 = line1.concat("-----");
                    line2 = line2.concat("     ");
                    line3 = line3.concat("-----");
                    line4 = line4.concat("     ");
                    line5 = line5.concat("--O--");
                    line6 = line6.concat("     ");
                    line7 = line7.concat("-----");
                    line8 = line8.concat("     ");
                    line9 = line9.concat("-----");
                    line10 = line10.concat("     ");
                    break;
                case C:
                    line0 = line0.concat("     ");
                    line1 = line1.concat("-----");
                    line2 = line2.concat("     ");
                    line3 = line3.concat("-----");
                    line4 = line4.concat("  O  ");
                    line5 = line5.concat("-----");
                    line6 = line6.concat("     ");
                    line7 = line7.concat("-----");
                    line8 = line8.concat("     ");
                    line9 = line9.concat("-----");
                    line10 = line10.concat("     ");
                    break;
                case D:
                    line0 = line0.concat("     ");
                    line1 = line1.concat("-----");
                    line2 = line2.concat("     ");
                    line3 = line3.concat("--O--");
                    line4 = line4.concat("     ");
                    line5 = line5.concat("-----");
                    line6 = line6.concat("     ");
                    line7 = line7.concat("-----");
                    line8 = line8.concat("     ");
                    line9 = line9.concat("-----");
                    line10 = line10.concat("     ");
                    break;
                case E:
                    line0 = line0.concat("     ");
                    line1 = line1.concat("-----");
                    line2 = line2.concat("  O  ");
                    line3 = line3.concat("-----");
                    line4 = line4.concat("     ");
                    line5 = line5.concat("-----");
                    line6 = line6.concat("     ");
                    line7 = line7.concat("-----");
                    line8 = line8.concat("     ");
                    line9 = line9.concat("-----");
                    line10 = line10.concat("     ");
                    break;
                case F:
                    line0 = line0.concat("     ");
                    line1 = line1.concat("--O--");
                    line2 = line2.concat("     ");
                    line3 = line3.concat("-----");
                    line4 = line4.concat("     ");
                    line5 = line5.concat("-----");
                    line6 = line6.concat("     ");
                    line7 = line7.concat("-----");
                    line8 = line8.concat("     ");
                    line9 = line9.concat("-----");
                    line10 = line10.concat("     ");
                    break;
                case G:
                    line0 = line0.concat("     ");
                    line1 = line1.concat("-----");
                    line2 = line2.concat("     ");
                    line3 = line3.concat("-----");
                    line4 = line4.concat("     ");
                    line5 = line5.concat("-----");
                    line6 = line6.concat("     ");
                    line7 = line7.concat("--O--");
                    line8 = line8.concat("     ");
                    line9 = line9.concat("-----");
                    line10 = line10.concat("     ");
                    break;
            }
        }

        System.out.println(line0);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
        System.out.println(line8);
        System.out.println(line9);
        System.out.println(line10);
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
