package ua.opnu;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class SqlReader {
    public static String readSqlFile(String filePath) {
        try {
            return String.join("\n", Files.readAllLines(Paths.get(filePath)));
        } catch (IOException e) {
            throw new RuntimeException("Помилка читання файлу: " + filePath, e);
        }
    }
}