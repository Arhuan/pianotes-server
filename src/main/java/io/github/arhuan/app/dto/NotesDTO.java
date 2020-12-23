package io.github.arhuan.app.dto;

import io.github.arhuan.app.model.Clef;
import io.github.arhuan.app.model.Note;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NotesDTO {

    private Note note;
    private Clef clef;
    private int octave;
}
