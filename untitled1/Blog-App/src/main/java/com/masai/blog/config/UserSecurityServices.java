package com.masai.blog.config;

import com.masai.blog.module.User;
import com.masai.blog.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserSecurityServices implements UserDetailsService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       Optional<User> user = userDAO.findByMobileNumber(username);

       if(user.isPresent()){
           return new UserSecurity(user.get());
       }

        throw  new UsernameNotFoundException("User not found");
    }
}
