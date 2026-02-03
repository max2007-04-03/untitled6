package ua.opnu.model;

public class LongestProject {
    private String name;
    private int monthCount;
    public LongestProject(String name, int monthCount) { this.name = name; this.monthCount = monthCount; }
    @Override public String toString() { return "Project: " + name + " (" + monthCount + " months)"; }
}