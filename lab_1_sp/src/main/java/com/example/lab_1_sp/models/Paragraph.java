package com.example.lab_1_sp.models;

import com.example.lab_1_sp.services.AlignStrategy;
import  com.example.lab_1_sp.services.AlignLeft;

public class Paragraph implements Element{
    private String name;
    private AlignStrategy alignStrategy;
    public Paragraph(String name){
        this.name = name;
        alignStrategy = new AlignLeft();
    }

    @Override
    public void print(){
        if(alignStrategy == null){
            System.out.println(" Paragraph: "   + name);
        }
        else{
            alignStrategy.render(name);
        }
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

    public void setAlignStrategy(AlignStrategy alignStrategy){
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

    public String getText() {
        return name;
}
}