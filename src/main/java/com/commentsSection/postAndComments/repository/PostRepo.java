package com.commentsSection.postAndComments.repository;

import com.commentsSection.postAndComments.model.Post;
import com.commentsSection.postAndComments.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface PostRepo extends JpaRepository<Post, Long> {


    List<Post> findByUser(User user);
}
