package com.charanm.SpringBootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
    Computer comp;
    public void compile()
    {
        System.out.println("Compiling......!");
        comp.run();
    }
}
