package com.masai.blog.service;

import com.masai.blog.module.Post;
import com.masai.blog.module.User;
import com.masai.blog.repository.UserDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public boolean addUser(User user);

    public List<Post> paginateAndSortPost(Integer pageNo, Integer pageSize, String sortBy);




}
