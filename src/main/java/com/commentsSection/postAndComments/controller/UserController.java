package com.commentsSection.postAndComments.controller;

import com.commentsSection.postAndComments.dto.PostWithCommentsDTO;
import com.commentsSection.postAndComments.model.User;
import com.commentsSection.postAndComments.repository.UserRepo;
import com.commentsSection.postAndComments.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserRepo userRepo;

    @PostMapping("/new")
    public User newUser(@RequestBody User user){
        return userService.saveUserService(user);
    }


    @GetMapping("/find/{userID}/posts")
    public List<PostWithCommentsDTO> getAllPostsForUser(@PathVariable("userID") Long userID){

        return userService.getAllPostsForUserService(userID);
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return (List<User>) userRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserByID(@PathVariable("id") Long Id){
        return userRepo.findById(Id);
    }

}
