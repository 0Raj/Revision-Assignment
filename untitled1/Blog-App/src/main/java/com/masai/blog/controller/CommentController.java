package com.masai.blog.controller;

import com.masai.blog.module.Comment;
import com.masai.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts/{postID}/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public ResponseEntity<List<Comment>> getAllComment(@PathVariable("postID") Integer postID){
        return new ResponseEntity<>(commentService.getAllCommentsByPostID(postID), HttpStatus.OK);
    }

    @GetMapping("/{commentID}")
    public ResponseEntity<Comment> getCommentByID(@PathVariable("postID") Integer postID, @PathVariable("commentID") Integer commentID){
        return new ResponseEntity<>(commentService.getCommentByID(postID,commentID), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createComment(@PathVariable("postID") Integer postID,@RequestBody Comment comment){
            commentService.createNewComment(postID,comment);
        return new ResponseEntity<>("Comment added Succelssfully",HttpStatus.CREATED);
    }

    @DeleteMapping("/{commentID}")
    public ResponseEntity<String> deleteComment(@PathVariable("postID") Integer postID, @PathVariable("commentID") Integer commentID){
        commentService.deleteCommentByID(postID,commentID);
        return new ResponseEntity<>("Comment Deleted Succelssfully",HttpStatus.OK);
    }




}
