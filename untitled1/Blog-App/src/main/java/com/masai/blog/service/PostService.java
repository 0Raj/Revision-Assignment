package com.masai.blog.service;

import com.masai.blog.module.Post;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface PostService {
    public List<Post> getAllPost();

    public Post getPostById(Integer id);

    public boolean createPost(MultipartFile file, Post post) throws IOException;

    public boolean deletePostById(Integer id);


}
