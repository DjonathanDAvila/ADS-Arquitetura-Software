package com.ads.arquitetura.domain.MediaType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MediaTypeRepository extends JpaRepository<MediaType, UUID> {
}
