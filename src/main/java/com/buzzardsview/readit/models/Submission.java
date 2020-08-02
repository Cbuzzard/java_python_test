package com.buzzardsview.readit.models;

import javax.persistence.*;

@Entity
public class Submission {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Submission(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Submission() {}
}
