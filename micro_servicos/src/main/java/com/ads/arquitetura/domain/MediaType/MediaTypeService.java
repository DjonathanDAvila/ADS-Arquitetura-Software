package com.ads.arquitetura.domain.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MediaTypeService {
    @Autowired
    private MediaTypeRepository mediaTypeRepository;

    public List<MediaType> findAll() {
        return mediaTypeRepository.findAll();
    }

    public MediaType findById(UUID id) {
        return mediaTypeRepository.findById(id).orElse(null);
    }

    public MediaType save(MediaType mediaType) {
        return mediaTypeRepository.save(mediaType);
    }

    public void deleteById(UUID id) {
        mediaTypeRepository.deleteById(id);
    }
}
