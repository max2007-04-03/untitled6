package ua.opnu;


import ua.opnu.model.MaxProjectCountClient;
import ua.opnu.service.DatabaseInitService;
import ua.opnu.service.DatabaseQueryService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. Створюємо структуру (з DROP TABLE у скрипті це безпечно)
            DatabaseInitService.main(args);

            // 2. Наповнюємо даними
            DatabasePopulateService.main(args);

            // 3. Робимо запити
            DatabaseQueryService queryService = new DatabaseQueryService();

            System.out.println("Max Salary Workers:");
            queryService.findMaxSalaryWorker().forEach(System.out::println);

            System.out.println("\nLongest Projects:");
            queryService.findLongestProject().forEach(System.out::println);

            System.out.println("\nMax Projects Count Client:");
            queryService.findMaxProjectsClient().forEach(System.out::println);

            System.out.println("\n=== Youngest and Eldest Workers ===");
            queryService.findYoungestEldestWorkers().forEach(System.out::println);



        } catch (Exception e) {
            System.err.println("Сталася помилка в роботі додатка: " + e.getMessage());
        }
    }
}