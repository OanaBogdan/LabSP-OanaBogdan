package com.example.lab_1_sp;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Author {
    String name;

    public Author(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Author name: " + name);
    }
}
