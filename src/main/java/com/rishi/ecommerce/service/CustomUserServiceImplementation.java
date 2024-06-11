package com.rishi.ecommerce.service;

import com.rishi.ecommerce.model.User;
import com.rishi.ecommerce.repository.UserRepo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserServiceImplementation implements UserDetailsService {

    private UserRepo userRepo;

    public CustomUserServiceImplementation(UserRepo userRepo ){
        this.userRepo=userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(username);
        if (user==null){
            throw new UsernameNotFoundException("User not found with the provided email" + username);
        }

        List<GrantedAuthority> authorities = new ArrayList<>();

        return new org.springframework.security.core.userdetails.User(user.getEmail() , user.getPassword() ,authorities);
    }
}