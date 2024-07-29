package com.rishi.ecommerce.controller;

import com.rishi.ecommerce.exception.ProductException;
import com.rishi.ecommerce.exception.UserException;
import com.rishi.ecommerce.model.Cart;
import com.rishi.ecommerce.model.CartItem;
import com.rishi.ecommerce.model.User;
import com.rishi.ecommerce.request.AddItemRequest;
import com.rishi.ecommerce.response.ApiResponse;
import com.rishi.ecommerce.service.CartService;
import com.rishi.ecommerce.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    private CartService cartService;
    private UserService userService;

    public CartController(CartService cartService,UserService userService) {
        this.cartService=cartService;
        this.userService=userService;
    }

    @GetMapping("/")
    public ResponseEntity<Cart> findUserCartHandler(@RequestHeader("Authorization") String jwt) throws UserException {

        User user=userService.findUserProfileByJwt(jwt);

        Cart cart=cartService.findUserCart(user.getId());

        System.out.println("cart - "+cart.getUser().getEmail());

        return new ResponseEntity<Cart>(cart, HttpStatus.OK);
    }

    @PutMapping("/add")
    public ResponseEntity<CartItem> addItemToCart(@RequestBody AddItemRequest req,
                                                  @RequestHeader("Authorization") String jwt) throws UserException, ProductException {

        User user=userService.findUserProfileByJwt(jwt);

        CartItem item = cartService.addCartItem(user.getId(), req);

        ApiResponse res= new ApiResponse("Item Added To Cart Successfully",true);

        return new ResponseEntity<>(item,HttpStatus.ACCEPTED);

    }


}
