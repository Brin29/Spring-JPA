package com.breiner.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Aqui es donde corre el codigo
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		//Es el metodo encargado de iniciar la aplicacion
		var ctx = SpringApplication.run(Application.class, args);

		//En vez de instanciar la clase usa la inyeccion de dependencias
		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		//MyFirstClass myFirstClass = ctx.getBean("myFirstClass o el nombre del bean(myBean)",MyFirstClass.class);
		System.out.println(myFirstService.tellAStory());
		//System.out.println(myFirstService.getJavaVersion());
		//System.out.println(myFirstService.getOsName());
		//System.out.println(myFirstService.readProp());
		System.out.println(myFirstService.getCustomPropertyFromAnotherFile());
		System.out.println(myFirstService.getCustomPropertyFromAnotherFile2());
		System.out.println(myFirstService.getCustomProperty());
		System.out.println(myFirstService.getCustomPropertyInt());
	}
}
