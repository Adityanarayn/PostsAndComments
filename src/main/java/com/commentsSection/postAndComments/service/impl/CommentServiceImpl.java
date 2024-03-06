package com.commentsSection.postAndComments.service.impl;

import com.commentsSection.postAndComments.model.Comment;
import com.commentsSection.postAndComments.repository.CommentRepo;
import com.commentsSection.postAndComments.repository.PostRepo;
import com.commentsSection.postAndComments.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepo commentRepo;

    @Autowired
    PostRepo postRepo;

    public List<Comment> getAllCommentsService(){
        return commentRepo.findAll();
    }
}
