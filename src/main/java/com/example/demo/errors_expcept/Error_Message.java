package com.example.demo.errors_expcept;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class Error_Message {
    private int code_status;
    private String message;
}
