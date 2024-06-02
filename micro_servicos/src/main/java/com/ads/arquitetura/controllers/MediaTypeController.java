package com.ads.arquitetura.controllers;

import com.ads.arquitetura.domain.MediaType.MediaType;
import com.ads.arquitetura.domain.MediaType.MediaTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/media-type")
public class MediaTypeController {
    @Autowired
    private MediaTypeService mediaTypeService;

    @GetMapping
    public List<MediaType> getAllMediaTypes() {
        return mediaTypeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MediaType> getMediaTypeById(@PathVariable UUID id) {
        MediaType mediaType = mediaTypeService.findById(id);
        return mediaType != null ? ResponseEntity.ok(mediaType) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public MediaType createMediaType(@RequestBody MediaType mediaType) {
        return mediaTypeService.save(mediaType);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MediaType> updateMediaType(@PathVariable UUID id, @RequestBody MediaType mediaType) {
        MediaType existingMediaType = mediaTypeService.findById(id);
        if (existingMediaType != null) {
            mediaType.setId(id);
            return ResponseEntity.ok(mediaTypeService.save(mediaType));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMediaType(@PathVariable UUID id) {
        mediaTypeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
