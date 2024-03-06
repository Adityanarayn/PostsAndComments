package com.commentsSection.postAndComments.controller;

import com.commentsSection.postAndComments.model.Comment;
import com.commentsSection.postAndComments.model.Post;
import com.commentsSection.postAndComments.repository.CommentRepo;
import com.commentsSection.postAndComments.service.CommentService;
import com.commentsSection.postAndComments.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PostController {
    @Autowired
    PostService postService;
    @Autowired
    CommentService commentService;

    @Autowired
    CommentRepo commentRepo;


    @PostMapping("/create/post")
    public Post createPost(@RequestBody Post post){
        return postService.createPostService(post);
    }


    @PostMapping("/write/comment/{post_id}")
    public Comment addComment(@RequestBody Comment comment, @PathVariable int post_id){
        return commentRepo.save(comment);
    }

    @GetMapping("/{post_id}")
    public List<Comment> getAllTheComments(@PathVariable("post_id") Long post_id){
        return commentRepo.findByPostId(post_id);
    }
}
