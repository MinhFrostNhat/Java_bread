package com.example.demo.errors_expcept;

import jdk.jshell.spi.ExecutionControl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.NestedServletException;

import javax.servlet.http.*;

@RestControllerAdvice
@Slf4j
public class Run_Error {

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = InternalError.class)

    public Error_Message  handleAllExcepton(Exception ex, WebRequest request) {
        log.error("this is error" + ex.getLocalizedMessage());
        return new Error_Message(1200,ex.getLocalizedMessage());
    }




}
