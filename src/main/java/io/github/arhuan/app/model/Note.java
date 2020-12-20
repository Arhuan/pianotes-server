package io.github.arhuan.app.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Note {
    A,
    B,
    C,
    D,
    E,
    F,
    G;

    private static final List<Note> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final Random RANDOM = new Random();

    public static Note randomNote() {
        return VALUES.get(RANDOM.nextInt(VALUES.size()));
    }
}
