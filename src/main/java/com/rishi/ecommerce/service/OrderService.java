package com.rishi.ecommerce.service;

import com.rishi.ecommerce.exception.OrderException;
import com.rishi.ecommerce.model.Address;
import com.rishi.ecommerce.model.Order;
import com.rishi.ecommerce.model.User;

import java.util.List;

public interface OrderService {

public Order createOrder(User user , Address shippingAddress);
public Order findOrderById(Long OrderId) throws OrderException;
public List<Order> usersOrderHistory(Long userId);

public Order placedOrder(Long OrderId) throws OrderException;
public Order confirmedOrder(Long OrderId) throws OrderException;
public Order shippedOrder(Long OrderId) throws OrderException;
public Order deliveredOrder(Long OrderId) throws OrderException;
public Order cancelledOrder(Long OrderId) throws OrderException;
public  List<Order> getAllOrders();
public void deleteOrder(Long orderId) throws OrderException;


}
