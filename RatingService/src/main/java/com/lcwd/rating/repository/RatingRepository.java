package com.lcwd.rating.repository;

import com.lcwd.rating.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RatingRepository extends MongoRepository<Rating, String> {
}
