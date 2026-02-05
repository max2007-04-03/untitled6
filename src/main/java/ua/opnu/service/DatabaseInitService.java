package ua.opnu.service;

import ua.opnu.database.Database;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DatabaseInitService {
    public static void main(String[] args) {
        String fileName = "sql/init_db.sql";
        try {
            String sql = String.join("\n", Files.readAllLines(Paths.get(fileName)));
            Connection conn = Database.getInstance().getConnection();

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.execute();
                System.out.println("The database structure has been successfully initialized.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}