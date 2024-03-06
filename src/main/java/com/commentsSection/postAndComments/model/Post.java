package com.commentsSection.postAndComments.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "Post_table")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    private String content;
    private Integer likes;
    private Integer dislikes;

    private LocalDateTime dateTime;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comments= new ArrayList<>();





}
