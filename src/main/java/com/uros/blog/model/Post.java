package com.vidoje.blog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String content;
}
