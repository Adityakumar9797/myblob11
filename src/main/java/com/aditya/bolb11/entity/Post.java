package com.aditya.bolb11.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="posts")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    private String description;
    private  String content;
}
