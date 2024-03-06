package com.commentsSection.postAndComments.service.impl;

import com.commentsSection.postAndComments.dto.PostWithCommentsDTO;
import com.commentsSection.postAndComments.model.Comment;
import com.commentsSection.postAndComments.model.Post;
import com.commentsSection.postAndComments.model.User;
import com.commentsSection.postAndComments.repository.CommentRepo;
import com.commentsSection.postAndComments.repository.PostRepo;
import com.commentsSection.postAndComments.repository.UserRepo;
import com.commentsSection.postAndComments.service.UserService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    CommentRepo commentRepo;
    @Autowired
    PostRepo postRepo;

    public User saveUserService(User user){
        return userRepo.save(user);
    }

    public List<User> getAllUserService(){
        return userRepo.findAll();

    }

    public List<PostWithCommentsDTO> getAllPostsForUserService(Long userId) {
        Optional<User> userOptional = userRepo.findById(userId);
        if (userOptional.isEmpty()) {
            return Collections.emptyList(); // Return an empty list if user is not found
        }

        User user = userOptional.get();
        List<Post> posts = postRepo.findByUser(user);
        List<PostWithCommentsDTO> postWithComments = new ArrayList<>();

        for (Post post : posts) {
            List<Comment> commentList = commentRepo.findByPost(post);   // having the problem here itself
            post.setComments(commentList);
            PostWithCommentsDTO postWithCommentsDTO = new PostWithCommentsDTO(post);
            postWithComments.add(postWithCommentsDTO);
        }

        return postWithComments;
    }

//    public List<PostWithCommentsDTO> getAllPostsForUserService(Long userId) {
//        Optional<User> userOptional = userRepo.findById(userId);
//        if (userOptional.isEmpty()) {
//            return Collections.emptyList(); // Return an empty list if user is not found
//        }
//
//        User user = userOptional.get();
//        List<Post> posts = postRepo.findByUser(user);
//        List<PostWithCommentsDTO> postWithComments = new ArrayList<>();
//
//        for (Post post : posts) {
//            PostWithCommentsDTO postDTO = new PostWithCommentsDTO(post);
//            postWithComments.add(postDTO);
//        }
//
//        return postWithComments;
//    }


}

