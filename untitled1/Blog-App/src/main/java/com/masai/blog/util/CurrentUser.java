package com.masai.blog.util;

import com.masai.blog.module.User;
import com.masai.blog.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CurrentUser {
    private Object principal;

    @Autowired
    private UserDAO userDao;

    public User getCurrentUser() {
        principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        String username = ((UserDetails) principal).getUsername();
        //SecurityUser securityCustomer = (SecurityUser) principal;

        Optional<User> currentUser = userDao.findByMobileNumber(username);


        return currentUser.get();
    }
}
