/**
 * @author Vasilshift
 */
package com.example.modulshops.util;

import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


public class FlyWayMigration {
    private static final Logger logger = LoggerFactory.getLogger(FlyWayMigration.class);

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String user;

    @Value("${spring.datasource.password}")
    private String password;

    public static void flyWayMigration(String url, String username, String password) {
        logger.info("db migration started ... ");
        var flyWay = Flyway.configure()
                .dataSource(url, username, password)
                .locations("classpath:/db/migration")
                .load();
        flyWay.migrate();

        logger.info("db migration finished. ");
    }
}
