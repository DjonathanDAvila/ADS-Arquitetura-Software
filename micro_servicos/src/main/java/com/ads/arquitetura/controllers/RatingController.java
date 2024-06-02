package com.ads.arquitetura.controllers;

import com.ads.arquitetura.domain.Rating.Rating;
import com.ads.arquitetura.domain.Rating.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @GetMapping
    public List<Rating> getAllRatings() {
        return ratingService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rating> getRatingById(@PathVariable UUID id) {
        Rating rating = ratingService.findById(id);
        return rating != null ? ResponseEntity.ok(rating) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Rating createRating(@RequestBody Rating rating) {
        return ratingService.save(rating);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rating> updateRating(@PathVariable UUID id, @RequestBody Rating rating) {
        Rating existingRating = ratingService.findById(id);
        if (existingRating != null) {
            rating.setId(id);
            return ResponseEntity.ok(ratingService.save(rating));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRating(@PathVariable UUID id) {
        ratingService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
