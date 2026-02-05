package ua.opnu.model;

public class MaxSalaryWorker {

    private String name;
    private int salary;

    public MaxSalaryWorker(String name, int salary) {
        this.name = name; this.salary = salary;
    }

    @Override public String toString() {
        return "Worker: " + name + " (Salary: " + salary + ")";
    }
}