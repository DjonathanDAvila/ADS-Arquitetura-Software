package com.ads.arquitetura.domain.Participant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ParticipantService {
    @Autowired
    private ParticipantRepository participantRepository;

    public List<Participant> findAll() {
        return participantRepository.findAll();
    }

    public Participant findById(UUID id) {
        return participantRepository.findById(id).orElse(null);
    }

    public Participant save(Participant participant) {
        return participantRepository.save(participant);
    }

    public void deleteById(UUID id) {
        participantRepository.deleteById(id);
    }
}
