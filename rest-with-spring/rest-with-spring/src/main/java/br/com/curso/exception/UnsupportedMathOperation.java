package br.com.curso.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperation extends RuntimeException {
    public UnsupportedMathOperation(String message) {
        super(message);
    }
}
