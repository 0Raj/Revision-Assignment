package com.masai.blog.controller;

import com.masai.blog.module.Post;
import com.masai.blog.module.User;
import com.masai.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/resgister")
    public ResponseEntity<String> addUser( @RequestBody User user){
        userService.addUser(user);
        return new ResponseEntity<>("User Added Successfully", HttpStatus.ACCEPTED);
    }

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> paginationAndSortPost(@RequestParam Integer pageNo,
                                                            @RequestParam Integer pageSize,@RequestParam String sortBy){

        return new ResponseEntity<>(userService.paginateAndSortPost(pageNo,pageSize,sortBy), HttpStatus.ACCEPTED);
    }
}
