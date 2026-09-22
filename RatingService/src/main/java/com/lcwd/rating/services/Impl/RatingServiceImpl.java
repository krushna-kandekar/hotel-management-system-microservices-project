package com.lcwd.rating.services.Impl;

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.services.RatingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Override
    public Rating create(Rating rating) {
        return null;
    }

    @Override
    public List<Rating> getRatings() {
        return List.of();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return List.of();
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return List.of();
    }
}
