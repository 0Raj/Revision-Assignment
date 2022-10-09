package com.masai.blog.module;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(
        name="User",
        uniqueConstraints= @UniqueConstraint(columnNames={"mobileNumber"})
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private Integer userID;

    @NotNull
    @Pattern(regexp="[a-zA-Z]{3,12}", message = "Last Name must not contains numbers or special characters")
    private String name;

    @NotNull
    @Pattern(regexp="[6-9]{1}[0-9]{9}", message = "Mobile number must have 10 digits")
    private String mobileNumber;

    @NotNull
    private String password;

    private String role;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Post> posts = new ArrayList<>();

}
