package com.rishi.ecommerce.service;

import com.rishi.ecommerce.exception.UserException;
import com.rishi.ecommerce.model.User;

import java.util.List;

public interface UserService {

    public User findUserById(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;

    public List<User> findAllUsers();
}
