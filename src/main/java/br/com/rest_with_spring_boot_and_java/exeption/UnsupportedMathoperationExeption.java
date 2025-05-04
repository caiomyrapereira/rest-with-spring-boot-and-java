package br.com.rest_with_spring_boot_and_java.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathoperationExeption extends RuntimeException {

    public UnsupportedMathoperationExeption(String message){
        super(message);
    }
}
