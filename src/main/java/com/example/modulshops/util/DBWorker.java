/**
 * @author Vasilshift
 */
package com.example.modulshops.util;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

@AllArgsConstructor
public class DBWorker {
    private final Connection connection;

    @Value("${jdbc:postgresql://localhost:5432/moduleshops}")
    private String url;

    @Value("${postgres}")
    private String username;

    @Value("${123}")
    private String password;

    public DBWorker() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
    }
}
