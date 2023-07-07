package com.pwgtil.springbootplayground;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    private long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserDetails user_details;

    @OneToMany(mappedBy = "user")
//    @JoinColumn(name = "user_id", nullable = false)
    private List<Tweet> tweets = new ArrayList<>();

}

@Entity
class UserDetails {

    private long user_id;

    @Id
    private long user_detail_id;

    private String name;
    private String location;
    private String email;

}

@Entity
class Tweet {

    @Id
    @Column(name = "tweet_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
