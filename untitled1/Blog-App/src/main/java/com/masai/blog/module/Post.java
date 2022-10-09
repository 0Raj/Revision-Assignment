package com.masai.blog.module;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "post_id", nullable = false)
    private Integer postID;

    @ManyToOne
    @JsonIgnore
    private User user;

    private String caption;

    @JsonIgnore
    @OneToMany(mappedBy = "post")
    private List<Comment> comments = new ArrayList<>();

    @JsonIgnore
    private String fileName;
    @JsonIgnore
    private String fileType;

    @JsonIgnore
    @Lob
    private byte[] data;


}
