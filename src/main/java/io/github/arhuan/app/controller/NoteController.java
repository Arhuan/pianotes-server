package io.github.arhuan.app.controller;

import io.github.arhuan.app.dto.NotesDTO;
import io.github.arhuan.app.service.NoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("notes")
public class NoteController {

    private NoteService service;

    public NoteController(NoteService service) {
        this.service = service;
    }

    @GetMapping("/{num}")
    public List<NotesDTO> getNotes(@PathVariable int num) {
        return service.generateNotes(num);
    }
}
