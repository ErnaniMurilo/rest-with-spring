package br.com.curso.exception.handler;

import br.com.curso.exception.ExceptionResponse;
import br.com.curso.exception.UnsupportedMathOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@Controller
@ControllerAdvice
public class CustomEntityResponseHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleAllException(Exception excepetion, WebRequest webRequest) {
        ExceptionResponse response = new ExceptionResponse(
                new Date(),
                excepetion.getMessage(),
                webRequest.getDescription(false));
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UnsupportedMathOperation.class)
    public final ResponseEntity<ExceptionResponse> handleBadRequestException(Exception excepetion, WebRequest webRequest) {
        ExceptionResponse response = new ExceptionResponse(
                new Date(),
                excepetion.getMessage(),
                webRequest.getDescription(false));
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }



}
