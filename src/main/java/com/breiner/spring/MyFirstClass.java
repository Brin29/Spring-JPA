package com.breiner.spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//Sirve para conectar a varios repositorios
//@Service

//Indicar que una clase tiene mecanismos de CRUD
//@Repository

//Indicar una clase como un componente, Spring detecta la clase para la inyeccion de dependencias
//@Component
public class MyFirstClass {

    private final String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }


    public  String sayHello(){
        return "Hello from the MyFirstClass ==> myVar = " + myVar;
    }
}
