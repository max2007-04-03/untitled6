package ua.opnu.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final Database INSTANCE = new Database();
    private static final String DB_URL = "jdbc:h2:./test";
    private static final String USER = "sa";
    private static final String PASS = "";
    private Connection connection;

    private Database() {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException("Could not connect to the database.", e);
        }
    }

    public static Database getInstance() {

        return INSTANCE;
    }

    public Connection getConnection() {

        return connection;
    }
}