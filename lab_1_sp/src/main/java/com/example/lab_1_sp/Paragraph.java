package com.example.lab_1_sp;

public class Paragraph implements Element{
    private String name;
    public Paragraph(String name){
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println("Paragraph name: " + name);
    }
}