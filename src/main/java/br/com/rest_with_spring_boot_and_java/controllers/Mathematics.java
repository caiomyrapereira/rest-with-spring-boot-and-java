package br.com.rest_with_spring_boot_and_java.controllers;

import br.com.rest_with_spring_boot_and_java.exeption.UnsupportedMathoperationExeption;
import br.com.rest_with_spring_boot_and_java.services.Services;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/math")
@RestController
public class Mathematics {
    private Services services = new Services();
    // pesquisa pq dá erro no quando vc usa ${}
    @RequestMapping("/sum/{x}/{y}")
    public double sum(
            @PathVariable("x") String x,
            @PathVariable("y") String y
    ) throws Exception {
        return services.sum(x,y);
    }

    @RequestMapping("/sub/{x}/{y}")
    public double subtraction(
            @PathVariable("x")  String x,
            @PathVariable("y")  String y
    ) throws Exception {
        return services.sub(x,y);
    }

    @RequestMapping("/multi/{x}/{y}")
    public double multiplication(
           @PathVariable("x") String x,
           @PathVariable("y") String y
    ) throws Exception {
        return services.multi(x,y);
    }

    @RequestMapping("/div/{x}/{y}")
    public double dividi(
            @PathVariable("x") String x,
            @PathVariable("y") String y
    ) throws Exception {
        return services.division(x,y);
    }


    @RequestMapping("/media/{x}/{y}")
    public double media(
            @PathVariable("x") String x,
            @PathVariable("y") String y
    ) throws Exception {
        return services.media(x,y);
    }

    @RequestMapping("/raiz/{x}")
    public double raiz(
            @PathVariable("x") String x
    ) throws Exception {
        return services.raiz(x);
    }



}
