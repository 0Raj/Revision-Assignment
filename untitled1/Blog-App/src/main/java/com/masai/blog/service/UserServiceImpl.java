package com.masai.blog.service;

import com.masai.blog.module.Post;
import com.masai.blog.module.User;
import com.masai.blog.repository.PostSortAndPagination;
import com.masai.blog.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserDAO userDao;

    @Autowired
    private PostSortAndPagination postSortAndPagination;

    @Override
    public boolean addUser(User user) {

        User user1 = new User();

        user1.setRole(user.getRole());
        user1.setName(user.getName());
        user1.setMobileNumber(user.getMobileNumber());
        user1.setPassword(passwordEncoder.encode(user.getPassword()));


        userDao.save(user1);
        return user1 != null?true:false;
    }

    @Override
    public List<Post> paginateAndSortPost(Integer pageNo, Integer pageSize, String sortBy) {

        Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        List<Post> posts = (List<Post>) postSortAndPagination.findAll(pageable);

        return posts;
    }


}
