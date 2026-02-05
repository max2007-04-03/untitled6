package ua.opnu.service;

import ua.opnu.database.Database;

import java.sql.Statement;
import java.sql.Connection;

public class DatabasePopulateService {
    public static void main(String[] args) {
        String sql = SqlReader.readSqlFile("sql/populate_db.sql");

        try {
            Connection conn = Database.getInstance().getConnection();

            try (Statement stmt = conn.createStatement()) {
                stmt.execute(sql);
                System.out.println("The tables have been successfully populated with data.");
            }
        } catch (Exception e) {
            System.err.println("Error while filling the database: " + e.getMessage());
            e.printStackTrace();
        }
    }
}