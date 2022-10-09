package com.masai.blog.repository;

import com.masai.blog.module.Post;
import com.masai.blog.module.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface PostDAO extends JpaRepository<Post,Integer> {

}
