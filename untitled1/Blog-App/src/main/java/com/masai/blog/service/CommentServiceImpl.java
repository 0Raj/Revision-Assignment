package com.masai.blog.service;

import com.masai.blog.module.Comment;
import com.masai.blog.module.Post;
import com.masai.blog.module.User;
import com.masai.blog.repository.CommentDAO;
import com.masai.blog.repository.PostDAO;
import com.masai.blog.util.CurrentUser;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CurrentUser currentUser;
    @Autowired
    private CommentDAO commentDAO;

    @Autowired
    private PostDAO postDAO;

    @Override
    public List<Comment> getAllCommentsByPostID(Integer postID) {
        return postDAO.findById(postID).get().getComments();
    }

    @Override
    public Comment getCommentByID(Integer postID, Integer commentID) {
        return commentDAO.findById(commentID).get();
    }

    @Override
    public boolean createNewComment(Integer postID, Comment comment) {
        User user = currentUser.getCurrentUser();

        comment.setUser(user);
       Optional<Post> postOptional = postDAO.findById(postID);
        Post post = postOptional.get();
        post.getComments().add(comment);

        comment.setPost(post);

        commentDAO.save(comment);
        postDAO.save(post);
        return true;
    }

    @Override
    public boolean deleteCommentByID(Integer postID, Integer commentID) {
        Comment comment = commentDAO.findById(commentID).get();
        commentDAO.delete(comment);
        return true;
    }
}
