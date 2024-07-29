package com.rishi.ecommerce.repository;

import com.rishi.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("Select o FROM Order o where o.user.id = :userId AND (o.orderStatus = 'PLACED' OR o.orderStatus = 'CONFIRMED' OR o.orderStatus = 'SHIPPED' or o.orderStatus = 'DELIVERED')")
    public List<Order> getUsersOrders(@Param("userId") Long userId);
}
