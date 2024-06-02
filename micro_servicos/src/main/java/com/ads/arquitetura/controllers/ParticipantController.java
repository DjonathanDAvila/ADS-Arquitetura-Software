package com.ads.arquitetura.controllers;

import com.ads.arquitetura.domain.Participant.Participant;
import com.ads.arquitetura.domain.Participant.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/participant")
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @GetMapping
    public List<Participant> getAllParticipants() {
        return participantService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Participant> getParticipantById(@PathVariable UUID id) {
        Participant participant = participantService.findById(id);
        return participant != null ? ResponseEntity.ok(participant) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Participant createParticipant(@RequestBody Participant participant) {
        return participantService.save(participant);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Participant> updateParticipant(@PathVariable UUID id, @RequestBody Participant participant) {
        Participant existingParticipant = participantService.findById(id);
        if (existingParticipant != null) {
            participant.setId(id);
            return ResponseEntity.ok(participantService.save(participant));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParticipant(@PathVariable UUID id) {
        participantService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
