package com.buzzardsview.readit.models;

import javax.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Post(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Post() {}
}
