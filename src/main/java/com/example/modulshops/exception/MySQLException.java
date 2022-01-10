package com.example.modulshops.exception;

import java.sql.SQLException;
import java.util.function.Supplier;

public class MySQLException extends RuntimeException {

    String message = "MySQLException";

    public MySQLException(String message) {
        this.message = message;
        System.out.println("SQLException: " + message);
    }

}
