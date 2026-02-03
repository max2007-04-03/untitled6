package ua.opnu;

import ua.opnu.database.Database;

import java.sql.Statement;
import java.sql.Connection;

public class DatabasePopulateService {
    public static void main(String[] args) {
        // Зчитуємо SQL код з файлу за допомогою нашої утиліти
        String sql = SqlReader.readSqlFile("sql/populate_db.sql");

        try {
            // Отримуємо з'єднання через наш Singleton
            Connection conn = Database.getInstance().getConnection();

            try (Statement stmt = conn.createStatement()) {
                // Виконуємо скрипт наповнення
                stmt.execute(sql);
                System.out.println("Таблиці успішно наповнені даними.");
            }
        } catch (Exception e) {
            System.err.println("Помилка під час наповнення БД: " + e.getMessage());
            e.printStackTrace();
        }
    }
}