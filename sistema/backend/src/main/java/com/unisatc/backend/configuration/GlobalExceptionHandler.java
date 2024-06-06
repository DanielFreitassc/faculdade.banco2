package com.unisatc.backend.configuration;

import java.util.stream.Collectors;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.server.ResponseStatusException;

import com.unisatc.backend.exceptions.errorResponse.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationExceptions(MethodArgumentNotValidException ex) {
        String errorMessage = ex.getBindingResult().getAllErrors().stream()
                .map(ObjectError::getDefaultMessage)
                .collect(Collectors.joining(", "));
        
        ErrorResponse errorResponse = new ErrorResponse("BAD_REQUEST", errorMessage);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

     @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ErrorResponse> handleResponseStatusException(ResponseStatusException ex) {
        String errorMessage = ex.getReason();
        ErrorResponse errorResponse = new ErrorResponse("NOT_FOUND", errorMessage);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ErrorResponse> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        String errorMessage;
        if (ex.getMessage().contains("Value too long for column")) {
            errorMessage = "O valor excede o tamanho máximo permitido para a coluna.";
        } else {
            errorMessage = "Ocorreu um erro ao processar sua solicitação.";
        }

        ErrorResponse errorResponse = new ErrorResponse("BAD_REQUEST", errorMessage);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ErrorResponse> handleTypeMismatchExceptions(MethodArgumentTypeMismatchException ex) {
        String errorMessage = "Parâmetro '" + ex.getName() + "' deve ser do tipo '" + ex.getRequiredType().getSimpleName() + "'";
        
        ErrorResponse errorResponse = new ErrorResponse("BAD_REQUEST", errorMessage);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
