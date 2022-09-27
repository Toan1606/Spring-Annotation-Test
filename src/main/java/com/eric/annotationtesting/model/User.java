package com.eric.annotationtesting.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "gender")
    private Boolean gender;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "createdBy", cascade = CascadeType.ALL)
    private Set<Post> createdBy;

    @OneToMany(mappedBy = "lastModifiedBy", cascade = CascadeType.ALL)
    private Set<Post> modifiedBy;

}
