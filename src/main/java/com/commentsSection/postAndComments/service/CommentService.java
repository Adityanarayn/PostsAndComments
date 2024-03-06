package com.commentsSection.postAndComments.service;

import com.commentsSection.postAndComments.model.Comment;
import com.commentsSection.postAndComments.service.impl.CommentServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CommentService  {
    List<Comment> getAllCommentsService();
}
