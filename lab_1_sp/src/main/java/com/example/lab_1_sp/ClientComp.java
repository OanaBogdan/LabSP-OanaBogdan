package com.example.lab_1_sp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ClientComp {
    private final TransientComp tc;
    private final SingletonComp sc;
    @Autowired
    public ClientComp(TransientComp tc, SingletonComp
            sc) {
        this.tc = tc;
        this.sc = sc;
        System.out.println("ClientComponent::ClientComponent = " +

                this);
        System.out.println(" o SingletonComponent = " + sc);
        System.out.println(" o TransientComponent = " + tc);
    }
    public void operation() {
        System.out.println("Invoked ClientComponent::operation() on " +
                this);
        System.out.println(" o SingletonComponent = " + sc);
        System.out.println(" o TransientComponent = " + tc);
    }
}