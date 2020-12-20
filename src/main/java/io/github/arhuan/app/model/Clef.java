package io.github.arhuan.app.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Clef {
    TREBLE,
    BASS;

    private static final List<Clef> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final Random RANDOM = new Random();

    public static Clef randomClef() {
        return VALUES.get(RANDOM.nextInt(VALUES.size()));
    }
}
