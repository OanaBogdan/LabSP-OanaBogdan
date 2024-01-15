package com.example.lab_1_sp.models;



public interface Element extends Visitee{
    void print();
    void add(Element e);
    void removeElement(Element e);
    Element get(int i);
}