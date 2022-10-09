package com.masai.blog.service;

import com.masai.blog.module.Post;
import com.masai.blog.module.User;
import com.masai.blog.repository.PostDAO;
import com.masai.blog.util.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostDAO postDAO;

    @Autowired
    private CurrentUser currentUser;

    @Override
    public List<Post> getAllPost() {
        return postDAO.findAll();
    }

    @Override
    public Post getPostById(Integer id) {
        return postDAO.findById(id).get();
    }

    @Override
    public boolean createPost(MultipartFile file, Post post) throws IOException {

        User user = currentUser.getCurrentUser();

        post.setData(file.getBytes());
        post.setUser(user);
        post.setFileName(file.getOriginalFilename());
        post.setFileType(file.getContentType());


        Post post1 = postDAO.save(post);

        return post1 != null ? true : false ;
    }

    @Override
    public boolean deletePostById(Integer id) {

        Post post1 = getPostById(id);

        postDAO.delete(post1);

        return true;
    }
}
