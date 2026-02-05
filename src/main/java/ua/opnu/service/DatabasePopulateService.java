package ua.opnu.service;

import ua.opnu.database.Database;

import java.sql.PreparedStatement;
import java.sql.Connection;

public class DatabasePopulateService {
    public static void main(String[] args) {
        String sql = SqlReader.readSqlFile("sql/populate_db.sql");

        try {
            Connection conn = Database.getInstance().getConnection();
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.execute();
                System.out.println("Success");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}