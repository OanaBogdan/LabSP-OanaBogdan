package com.example.lab_1_sp.models;

public class Author {
    String name;

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Author: " + name);
    }
}

