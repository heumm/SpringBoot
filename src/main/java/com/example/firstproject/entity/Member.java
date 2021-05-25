package com.example.firstproject.entity;


import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@ToString
public class Member {

    @Id
    private String username;
    @Column
    private String email;
    @Column
    private String password;
}
