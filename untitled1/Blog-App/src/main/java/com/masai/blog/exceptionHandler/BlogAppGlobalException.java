package com.masai.blog.exceptionHandler;

import com.masai.blog.exception.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class BlogAppGlobalException {


    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<ErrorDetails> httpRequestMethodException(HttpRequestMethodNotSupportedException exception, WebRequest request){

        ErrorDetails errorDetail = new ErrorDetails(
                LocalDateTime.now(),
                HttpStatus.METHOD_NOT_ALLOWED.value(),
                exception.getMessage(),
                request.getDescription(false)
        );

        return new ResponseEntity<ErrorDetails>(errorDetail, HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<ErrorDetails> missingServletRequestParameterException(MissingServletRequestParameterException exception, WebRequest request){

        ErrorDetails errorDetail = new ErrorDetails(
                LocalDateTime.now(),
                HttpStatus.METHOD_NOT_ALLOWED.value(),
                exception.getMessage(),
                request.getDescription(false)
        );

        return new ResponseEntity<ErrorDetails>(errorDetail, HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDetails> myMANVExceptionHandler(MethodArgumentNotValidException methodArgumentNotValidException) {

        ErrorDetails err = new ErrorDetails(
                LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),
                "Validation Error",
                methodArgumentNotValidException.getMessage()
        );

        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> generalException(Exception exception, WebRequest request){

        ErrorDetails errorDetail = new ErrorDetails(
                LocalDateTime.now(),
                HttpStatus.METHOD_NOT_ALLOWED.value(),
                exception.getMessage(),
                request.getDescription(false)
        );

        return new ResponseEntity<ErrorDetails>(errorDetail, HttpStatus.METHOD_NOT_ALLOWED);
    }

}
