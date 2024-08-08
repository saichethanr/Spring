package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("desk")
@Primary
public class Desktop implements Computer{


    public Desktop(){
        System.out.println("Desktop object created");
    }

    @Override
    public void compile() {
        System.out.println("Desktop Speaking");
    }
}
