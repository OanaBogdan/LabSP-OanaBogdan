package com.example.lab_1_sp.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonComp {
    public SingletonComp() {
        System.out.println(
                "SingletonComponent::SingletonComponent = " + this);

    }
    public void operation() {
        System.out.println(
                "Invoked SingletonComponent::operation() on " +this);

    }
}