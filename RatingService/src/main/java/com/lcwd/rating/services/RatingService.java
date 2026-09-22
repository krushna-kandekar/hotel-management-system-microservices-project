package com.lcwd.rating.services;

import com.lcwd.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);


    //get all ratings
    List<Rating> getRatings();


    //get all by userId
    List<Rating> getRatingByUserId(String userId);


    //get al;l by hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
