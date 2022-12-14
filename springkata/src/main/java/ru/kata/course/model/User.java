package ru.kata.course.model;


import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name = "users", schema = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    private String name;
    private String lastname;

    public User() {}

    public  User(int id, String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
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


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
