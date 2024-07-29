package com.rishi.ecommerce.service;

import com.rishi.ecommerce.exception.ProductException;
import com.rishi.ecommerce.model.Product;
import com.rishi.ecommerce.model.Review;
import com.rishi.ecommerce.model.User;
import com.rishi.ecommerce.repository.ProductRepository;
import com.rishi.ecommerce.repository.ReviewRepository;
import com.rishi.ecommerce.request.ReviewRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{

    private ReviewRepository reviewRepository;
    private ProductRepository productRepository;
    private ProductService productService;


    public ReviewServiceImpl(ReviewRepository reviewRepository, ProductRepository productRepository, ProductService productService) {
        this.reviewRepository = reviewRepository;
        this.productRepository = productRepository;
        this.productService = productService;
    }

    @Override
    public Review createReview(ReviewRequest req, User user) throws ProductException {
        Product product = productService.findProductById(req.getProductId());

        Review review = new Review();
        review.setUser(user);
        review.setProduct(product);
        review.setReview(req.getReview());
        review.setCreatedAt(LocalDateTime.now());

        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getAllReview(Long productId) {
        return reviewRepository.getAllProductsReview(productId);
    }
}
