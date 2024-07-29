package com.rishi.ecommerce.service;

import com.rishi.ecommerce.exception.ProductException;
import com.rishi.ecommerce.model.Review;
import com.rishi.ecommerce.model.User;
import com.rishi.ecommerce.request.ReviewRequest;

import java.util.List;

public interface ReviewService {

    public Review createReview(ReviewRequest req , User user) throws ProductException;
    public List<Review> getAllReview(Long productId);

}
