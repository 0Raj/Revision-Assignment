package com.masai.blog.module;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comment_id", nullable = false)
    private Integer commentID;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String content;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;


}
