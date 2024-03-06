package com.commentsSection.postAndComments.dto;

import com.commentsSection.postAndComments.model.Comment;
import com.commentsSection.postAndComments.model.Post;
import com.commentsSection.postAndComments.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostWithCommentsDTO {
    private Post post;
//    private List<Comment> comments;
}
