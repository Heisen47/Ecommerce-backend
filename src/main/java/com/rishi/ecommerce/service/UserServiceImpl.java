package com.rishi.ecommerce.service;

import com.rishi.ecommerce.config.JwtTokenProvider;
import com.rishi.ecommerce.exception.UserException;
import com.rishi.ecommerce.model.User;
import com.rishi.ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepo;
    private JwtTokenProvider jwtProvider;

    public UserServiceImpl(UserRepository userRepo , JwtTokenProvider jwtProvider){
        this.userRepo = userRepo;
        this.jwtProvider = jwtProvider;
    }

    @Override
    public User findUserById(Long userId) throws UserException {
        Optional<User> user = userRepo.findById(userId);
        if(user.isPresent()){
            return user.get();
        }

        throw new UserException("user not found with id :" + userId);
    }

    @Override
    public User findUserProfileByJwt(String jwt) throws UserException {
        String email = jwtProvider.getEmailFromJwtToken(jwt);

        User user  = userRepo.findByEmail(email);
        if(user == null){
            throw new UserException("user not found with email: "+ email);
        }
        return user;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepo.findAllByOrderByCreatedAtDesc();
    }
}
