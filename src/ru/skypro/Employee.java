package ru.skypro;

public class Employee {
    private static int counterId = 1;
    private final int id;
    private final String fullName;
    private int department;
    private double salary;

    public Employee(String fullName, int department, double salary) {
        id = counterId;
        counterId++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public static int getCounterId() {
        return counterId;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + ", " + fullName + ", " + department + ", " + salary;
    }


}
