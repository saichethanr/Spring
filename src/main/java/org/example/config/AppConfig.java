package org.example.config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//if we want to make this class configoration classs we have to add this annotation
@Configuration
public class AppConfig {

    @Bean(name = {"com2","desktop1","beast"})
    public Desktop desktop(){
        return new Desktop();
    }
}
