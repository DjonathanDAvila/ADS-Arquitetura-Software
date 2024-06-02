package com.ads.arquitetura.domain.Rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    public List<Rating> findAll() {
        return ratingRepository.findAll();
    }

    public Rating findById(UUID id) {
        return ratingRepository.findById(id).orElse(null);
    }

    public Rating save(Rating rating) {
        return ratingRepository.save(rating);
    }

    public void deleteById(UUID id) {
        ratingRepository.deleteById(id);
    }
}
