package com.example.modulshops.exception;

import java.sql.SQLException;

public class MySQLException extends SQLException {

    public MySQLException(String message) {
        System.out.println("SQLException: " + message);
    }

}
