package io.github.arhuan.app.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Note {
    A,
    A_SHARP,
    A_FLAT,
    B,
    B_SHARP,
    B_FLAT,
    C,
    C_SHARP,
    C_FLAT,
    D,
    D_SHARP,
    D_FLAT,
    E,
    E_SHARP,
    E_FLAT,
    F,
    F_SHARP,
    F_FLAT,
    G,
    G_SHARP,
    G_FLAT;

    private static final List<Note> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final Random RANDOM = new Random();

    public static Note randomNote() {
        return VALUES.get(RANDOM.nextInt(VALUES.size()));
    }
}
