package ua.opnu.service;

import ua.opnu.database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DatabasePopulateService {
    public static void main(String[] args) {
        String sql = SqlReader.readSqlFile("sql/populate_db.sql");

        try {
            Connection conn = Database.getInstance().getConnection();

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.execute();
                System.out.println("The tables have been successfully populated with data.");
            }
        } catch (Exception e) {
            System.err.println("Error while filling the database: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
}
