package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //DB가 해당 객체를 엔티티로 인식 가능
@AllArgsConstructor
@ToString
public class Article {

    @Id //primary key 어노테이션
    @GeneratedValue //1, 2, 3 등 자동 부여 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;


}
