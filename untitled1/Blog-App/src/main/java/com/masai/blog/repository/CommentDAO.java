package com.masai.blog.repository;

import com.masai.blog.module.Comment;
import com.masai.blog.module.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentDAO extends JpaRepository<Comment,Integer> {

}
