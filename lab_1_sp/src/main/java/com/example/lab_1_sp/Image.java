package com.example.lab_1_sp;

public class Image implements Element{
    private String imagename;

    Image(String imagename){
        this.imagename = imagename;
    }

    @Override
    public void print(){
        System.out.println("Image with name: " + imagename);
    }

    @Override
    public void add(Element e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeElement(Element e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Element get(int i) {
        throw new UnsupportedOperationException();
    }
}