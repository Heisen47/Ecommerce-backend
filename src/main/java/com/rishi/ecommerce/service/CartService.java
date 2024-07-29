package com.rishi.ecommerce.service;

import com.rishi.ecommerce.exception.ProductException;
import com.rishi.ecommerce.model.Cart;
import com.rishi.ecommerce.model.CartItem;
import com.rishi.ecommerce.model.User;
import com.rishi.ecommerce.request.AddItemRequest;

public interface CartService {

    public Cart createCart(User user);
    public CartItem addCartItem(Long userId, AddItemRequest req) throws ProductException;
    public Cart findUserCart(Long userId);


}
