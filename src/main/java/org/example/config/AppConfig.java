package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

//if we want to make this class configoration classs we have to add this annotation
@Configuration
public class AppConfig {

    //if we want to call alien its dependent on the computer object
    //it will say: Hey container i want the computer Object
    //computer :Hey i have a desktop object
    //@Autowired is optional as even without it it would work
    //@Qualifier("desktop") can be used to refer to the desktop class
    @Bean()
    public Alien alien(@Autowired Computer com){
        Alien obj = new Alien();
        obj.setK(25);
        obj.setComp(com);
        return obj;
    }


    //as there are two beans below auto wired to the Alien bean above its difficult to configure which once hence
    //use of primary bean is very essential
    @Bean()
    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }
}
