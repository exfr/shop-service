/**
 * @author Vasilshift
 */
package com.example.modulshops.exception;

import org.springframework.stereotype.Component;

@Component
public class BusinessException extends RuntimeException {

    public BusinessException() {
    }

    public BusinessException(String message) {
        System.out.println("Business Exception: " + message);
    }
}
