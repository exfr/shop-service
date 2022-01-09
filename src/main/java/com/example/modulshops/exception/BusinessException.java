package com.example.modulshops.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

//todo: controller advice - see exception errors
@Component
@NoArgsConstructor
@Getter
@Setter
public class BusinessException extends RuntimeException {

    private String message;

    public BusinessException(String message) {
        System.out.println("Business Exception: " + message);
    }
}
