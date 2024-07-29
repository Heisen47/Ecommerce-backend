package com.rishi.ecommerce.repository;

import com.rishi.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

    public User findByEmail(String email);

}
