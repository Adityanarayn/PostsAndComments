package com.commentsSection.postAndComments.repository;

import com.commentsSection.postAndComments.model.Comment;
import com.commentsSection.postAndComments.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepo extends JpaRepository<Comment, Long> {


    List<Comment> findByPost(Post post);
}
