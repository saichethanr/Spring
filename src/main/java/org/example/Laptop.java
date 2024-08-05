package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//by writing @component you wouldnt require anything to write in the java config or the xml config files
//but spring wouldnt know that u have written the @component it will check for it in the cpnfig files
//how would we compunicatee to spring not to check the config files
//this can be done using the component scan
@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop called");
    }

    @Override
    public void compile(){
        System.out.println("Laptop Speaking");
    }
}
