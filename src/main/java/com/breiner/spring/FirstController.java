package com.breiner.spring;

import org.springframework.web.bind.annotation.*;

// Para que lo tome como un Spring Rest
@RestController
public class FirstController {

    //Mapear la peticion get de una url
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from my first controller";
    }

    /*
    @GetMapping("/hello-2")
    //Elegir el estado HTTP en que queremos que se muestre
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String sayHello2(){
        return "<h1>LO SENTIMOS LA PAGINA NO FUE ENCONTRADA</h1>";
    }
     */

    @PostMapping("/post")
    //String message es el body
    //A SpringBoot se le debe definir que es cada cosa body
    public String post(@RequestBody  String message) {
        return  "Request Accepted and message is :" + message;
    }

    @PostMapping("/post-order")
    //String message es el body
    //A SpringBoot se le debe definir que es cada cosa body
    public String post(@RequestBody  Order order) {
        return  "Request Accepted and order is :" + order.toString();
    }


}
