package com.masai.blog.repository;

import com.masai.blog.module.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDAO extends JpaRepository<User,Integer> {
   public Optional<User> findByMobileNumber(String username);
}
