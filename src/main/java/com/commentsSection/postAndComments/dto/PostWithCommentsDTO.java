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
//@Data
//public class PostWithCommentsDTO {
//    private Post post;
//    private List<Comment> comments;
//}
public class PostWithCommentsDTO {

    @JsonProperty("post_id")
    private Long id;

    @JsonProperty("post_user")
    private User user;

    @JsonProperty("post_content")
    private String content;

    @JsonProperty("post_likes")
    private Integer likes;

    @JsonProperty("post_dislikes")
    private Integer dislikes;

    @JsonProperty("post_date_time")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime dateTime;
    // Exclude comments from the DTO

    public PostWithCommentsDTO(Post post) {
        this.id = post.getId();
        this.user = post.getUser();
        this.content = post.getContent();
        this.likes = post.getLikes();
        this.dislikes = post.getDislikes();
        this.dateTime = post.getDateTime();
        // Exclude comments from the DTO
    }

    // Getters and setters (omitted for brevity)
}
