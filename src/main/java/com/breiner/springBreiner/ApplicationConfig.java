/*package com.breiner.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

//Para que Sprint scane esta clase
@Configuration
//Configurar para todos
@Profile("dev")
public class ApplicationConfig {

    @Bean("bean1")
    //Condigurar los active profiles para cada propertie
    //@Profile("dev")
    //@Qualifier("bean1")
    public MyFirstClass myFirstBean() {
        return new MyFirstClass("First Bean");
    }

    @Bean
    //@Profile("test")
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
*/