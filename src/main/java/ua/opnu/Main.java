package ua.opnu;


import ua.opnu.service.DatabaseInitService;
import ua.opnu.service.DatabasePopulateService;
import ua.opnu.service.DatabaseQueryService;

public class Main {
    public static void main(String[] args) {
        try {
            DatabaseInitService.main(args);

            DatabasePopulateService.main(args);

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
            System.err.println("������� ������� � ����� �������: " + e.getMessage());
        }
    }
}