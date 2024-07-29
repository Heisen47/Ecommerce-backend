package com.rishi.ecommerce.service;

import com.rishi.ecommerce.exception.CartItemException;
import com.rishi.ecommerce.exception.UserException;
import com.rishi.ecommerce.model.Cart;
import com.rishi.ecommerce.model.CartItem;
import com.rishi.ecommerce.model.Product;

public interface CartItemService {

    public CartItem createCartItem(CartItem cartItem);

    public CartItem updateCartItem(Long userId, Long id , CartItem cartItem) throws CartItemException, UserException;

    public CartItem isCartItemExist(Cart cart , Product product , String size , Long userId);

    public void removeCartItem(Long userId , Long cartItemId) throws CartItemException , UserException;

    public CartItem findCartItemById(Long cartItemId) throws CartItemException;
}
