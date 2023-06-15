package com.library.apilibrary.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "library")
public class LibraryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 80, nullable = false)
    private String name;

    @Column(length = 30, nullable = false)
    private String author;

    @Column(length = 255, nullable = true)
    private String description;
    
    @Column(length = 255, nullable = true)
    private String imageUrl;

    @Column(length = 20, nullable = false)
    private String dateRegister;
    
    @Column(length = 20, nullable = true)
    private String dateUpdatedDb;
}