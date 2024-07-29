package com.rishi.ecommerce.service;

import com.rishi.ecommerce.exception.ProductException;
import com.rishi.ecommerce.model.Rating;
import com.rishi.ecommerce.model.User;
import com.rishi.ecommerce.request.RatingRequest;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RatingService {

    public Rating createRating(RatingRequest req, User user) throws ProductException;
    public List<Rating> getProductsRating(Long productId);

}
