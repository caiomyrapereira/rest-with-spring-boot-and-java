package br.com.rest_with_spring_boot_and_java.controllers;

import br.com.rest_with_spring_boot_and_java.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;


//essa anotação já adicionar duas anotação(@controller e @ResponseBody)
@RestController
public class GreetingControlle {


    private static final String template = "hello %s!";
    private final AtomicLong counter = new AtomicLong();

    // url/greeting?name=caio
    @RequestMapping("/greeting")
    public Greeting greeting(
            //para recebe o valor ?name=caio
            @RequestParam(value="name", defaultValue = "word")
            String name){
        //incrementAndGet A cada execução, ele vai acrescentar mais um valor..
        // String.format() em Java cria uma string formatada, substituindo marcadores como %s, %d, %f, etc., por valores que você passar.
        return new Greeting(counter.incrementAndGet() ,  String.format( template, name));
    }
}
