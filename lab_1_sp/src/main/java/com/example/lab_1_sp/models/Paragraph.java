package com.example.lab_1_sp;

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
}