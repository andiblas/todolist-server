package com.apujadas.spring.configuration;

import com.apujadas.spring.exceptions.ServerDisabledException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler(ServerDisabledException.class)
    public void handleServerDownError(HttpServletRequest request, IllegalArgumentException e) {

    }

}
