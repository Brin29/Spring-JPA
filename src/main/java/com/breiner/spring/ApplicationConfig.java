package com.breiner.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Para que Sprint scane esta clase
@Configuration
public class ApplicationConfig {

    @Bean("bean1")
    //@Qualifier("bean1")
    public MyFirstClass myFirstBean() {
        return new MyFirstClass("First Bean");
    }

    @Bean
    //@Qualifier("bean2")
    public MyFirstClass mySecondBean(){

        return new MyFirstClass("Second Bean");
    }

    //Informar que este bean sera el primero que corra
    @Bean
    //@Primary
    public MyFirstClass myThirdBean(){

        return new MyFirstClass("Third Bean");
    }
}
