package com.example.lab_1_sp;

public class Image implements Element{
    private String imagename;

    Image(String imagename){
        this.imagename = imagename;
    }

    @Override
    public void print(){
        System.out.println("Image name: " + imagename);
    }
}