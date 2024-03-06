package com.commentsSection.postAndComments.service.impl;

import com.commentsSection.postAndComments.model.Post;
import com.commentsSection.postAndComments.repository.PostRepo;
import com.commentsSection.postAndComments.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepo postRepo;

    public List<Post> getAllPostsService(){
        return postRepo.findAll();

    }

    public Post createPostService(Post post){
        return postRepo.save(post);
    }
}
