package com.breiner.spring;

import org.springframework.web.bind.annotation.*;

// Para que lo tome como un Spring Rest
@RestController
public class FirstController {

    //Mapear la peticion get de una url
    //@GetMapping("/hello")
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

    @PostMapping("/post-order-record")
    //String message es el body
    //A SpringBoot se le debe definir que es cada cosa body
    public String postRecord(@RequestBody  OrderRecord order) {
        return  "Request Accepted and order is :" + order.toString();
    }


    // http://localhost:8080/hello/breiner
    //PathVariable para identificar que el parametro {va a ser el del parametro}
    //@GetMapping("/hello/{user-name}")
    public String pathVar(@PathVariable("user-name") String userName){
        return "my value = " + userName;
    }

    
    // http://localhost:8080/hello?param_name=paramvalue&param_name_2=value_2
    @GetMapping("/hello")
    public String paramVar(
            @RequestParam("user-name") String userName,
            @RequestParam("user-lastname") String userLastname
    ){
        return "my value = " + userName + " " + userLastname;
    }
}
