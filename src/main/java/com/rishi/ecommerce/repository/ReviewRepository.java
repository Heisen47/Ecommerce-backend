package com.rishi.ecommerce.repository;

import com.rishi.ecommerce.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review , Long> {

    @Query("SELECT r from Review r WHERE r.product.id = :productId")
    public List<Review> getAllProductsReview(@Param("productId") Long productId);

}
