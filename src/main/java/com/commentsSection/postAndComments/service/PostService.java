package com.commentsSection.postAndComments.service;

import com.commentsSection.postAndComments.model.Post;
import com.commentsSection.postAndComments.service.impl.PostServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PostService {
    List<Post> getAllPostsService();

    Post createPostService(Post post);
}
