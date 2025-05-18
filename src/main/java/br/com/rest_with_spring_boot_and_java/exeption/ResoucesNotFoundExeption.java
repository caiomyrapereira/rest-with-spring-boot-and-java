package br.com.rest_with_spring_boot_and_java.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResoucesNotFoundExeption extends RuntimeException {

    public ResoucesNotFoundExeption(String message){
        super(message);
    }
}
