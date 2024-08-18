package com.portfolio.community.entitiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
@AllArgsConstructor
// JPA에서 제공하는 @로, 붙은 클래스를 기반으로 DB에 table을 생성한다. tabel name == class name
public class Article {
    @Id // primary key : Auto Increment
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String content;
}

