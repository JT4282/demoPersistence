package com.example.demoPersistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity(name = "users")
@Table()
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String name;
    private String email;
    private String password;
    private String about;

    public User(String name , String email, String password, String about){
        this.name = name;
        this.email = email;
        this.password = password;
        this.about = about;
    }


}
