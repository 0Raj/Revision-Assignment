package com.masai.blog.service;

import com.masai.blog.module.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {

    public List<Comment> getAllCommentsByPostID(Integer postID);

    public Comment getCommentByID(Integer postID, Integer commentID);

    public boolean createNewComment(Integer postID, Comment comment);

    public boolean deleteCommentByID(Integer postID, Integer commentID);
}
