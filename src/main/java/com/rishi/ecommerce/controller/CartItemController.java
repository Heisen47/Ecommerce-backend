package com.rishi.ecommerce.controller;

import com.rishi.ecommerce.service.CartItemService;
import com.rishi.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartItemController {
    @Autowired
    private CartItemService cartItemService;

    @Autowired
    private UserService userService;



}
