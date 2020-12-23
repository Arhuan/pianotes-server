package io.github.arhuan.app.service;

import io.github.arhuan.app.dto.NotesDTO;
import io.github.arhuan.app.model.MusicalNote;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor
public class NoteService {

    public List<NotesDTO> generateNotes(int num) {
        List<NotesDTO> notes = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            MusicalNote newNote = new MusicalNote();

            NotesDTO dto = new NotesDTO();
            dto.setNote(newNote.getNote());
            dto.setClef(newNote.getClef());
            dto.setOctave(4);

            notes.add(dto);
        }

        return notes;
    }
}
