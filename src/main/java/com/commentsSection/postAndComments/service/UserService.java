package com.commentsSection.postAndComments.service;

import com.commentsSection.postAndComments.dto.PostWithCommentsDTO;
import com.commentsSection.postAndComments.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User saveUserService(User user);

    List<User> getAllUserService();

    List<PostWithCommentsDTO> getAllPostsForUserService(Long userId);
}
