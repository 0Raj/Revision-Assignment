package com.masai.blog.controller;

import com.masai.blog.module.Post;
import com.masai.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;


    @GetMapping
    public ResponseEntity<List<Post>> getAllPost(){
        return new ResponseEntity<>(postService.getAllPost(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPostByID(@PathVariable("id") Integer id){
        return new ResponseEntity<>(postService.getPostById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createPost(@RequestPart("file") MultipartFile file, @RequestPart("post") Post post){

        System.out.println(post);
        try {
            postService.createPost(file,post);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new ResponseEntity<>("Posted Successfully", HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePostByID(@PathVariable("id") Integer id){

        postService.deletePostById(id);
        return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
    }

 }
