/*package com.breiner.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

@Service
//Para que pueda scan archivos de otras carpetas
//@PropertySource("classpath:custom.properties")
//Inyectar multiples carpetas
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom-file-2.properties")
})

public class MyFirstService {


    //@Autowired
    //Se puede nombrar al Qualifier(nombre bean, nombre clase)
    //@Qualifier("mySecondBean")
    private MyFirstClass myFirstClass;

    //Asignar valores
    @Value("${my.prop}")
    //No lo lee
    //Spring solo puede scan carpetas de aplication.properties o yaml
    private String customPropertyFromAnotherFile;

    @Value("${my.prop.2}")
    private String customPropertyFromAnotherFile2;

    @Value("${my.custom.property}")
    private String customProperty;

    @Value("${my.custom.property.int}")
    private Integer customPropertyInt;

    //Environment Bean:Leer algunos entornos del sistema, propiedades etc
    //private final Environment environment;

    public MyFirstService(@Qualifier("bean1") MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }


    //Inyeccion de metodos
    /*@Autowired
    public void injectDependecies(@Qualifier("bean1") MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    };
     */

    // Setter Injection
    /*
    public void setMyFirstClass(@Qualifier("bean1") MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    };
    */

/*
    public  String tellAStory(){
        return "The dependency is saying :" + myFirstClass.sayHello();
    }

    public String getCustomPropertyFromAnotherFile() {
        return customPropertyFromAnotherFile;
    }

    public String getCustomPropertyFromAnotherFile2() {
        return customPropertyFromAnotherFile2;
    }

    public String getCustomProperty() {
        return customProperty;
    }

    public Integer getCustomPropertyInt() {
        return customPropertyInt;
    }

    //Version de Java
    /*
    public String getJavaVersion(){

        return environment.getProperty("java.version");
    }

    public String getOsName(){
        return environment.getProperty("os.name");
    }

    public String readProp(){
        return environment.getProperty("my.custom.property");
    }

    @Autowired
    public void setEnvironment(Environment environment){
        this.environment = environment;
    }

}
*/
