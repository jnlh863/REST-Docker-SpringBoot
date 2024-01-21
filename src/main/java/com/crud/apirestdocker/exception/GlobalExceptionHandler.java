package com.crud.apirestdocker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDateTime;

@ControllerAdvice // Anotación que indica que esta clase proporcionará manejo global de excepciones para los controladores de Spring en la aplicación.
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class) //Indica que el método handleResourceNotFoundException manejará excepciones del tipo ResourceNotFoundException.
    public static ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex) {
        HttpStatus status = HttpStatus.NOT_FOUND;

        ErrorResponse errorResponse = new ErrorResponse(
                status.value(),
                status.getReasonPhrase(),
                ex.getMessage(),
                LocalDateTime.now()
        );

        return ResponseEntity.status(status).body(errorResponse);
    }
}

