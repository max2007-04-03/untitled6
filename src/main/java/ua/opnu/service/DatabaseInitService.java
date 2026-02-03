package ua.opnu.service;

import ua.opnu.database.Database;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Statement;
import java.sql.Connection;

public class DatabaseInitService {
    public static void main(String[] args) {
        String fileName = "sql/init_db.sql";
        try {
            String sql = String.join("\n", Files.readAllLines(Paths.get(fileName)));
            Connection conn = Database.getInstance().getConnection();


            try (java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.executeUpdate(); // Для скриптів створення структури
                System.out.println("The database structure has been successfully initialized.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}