package com.ads.arquitetura.domain.Participant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface ParticipantRepository extends JpaRepository<Participant, UUID> {
}
