package Bank;

import java.util.ArrayList;
import java.util.Arrays;

public class Manager extends Employee{
    private String name;
    private Double salary;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    String getDetails(Employee employee) {
        return "Name: " + employee.getName() + " Salary: " + employee.getSalary() +
                "\nManaging Developers:\n" + Arrays.toString(developers);
    }

    private int numdevs;
    private int i=0;

    private static String[] developers;
    public Manager(String name, Double salary, int numdevs) {
        this.name=name;
        this.salary=salary;
        developers=new String[numdevs];
    }

    public void addDeveloper(Developer developer){
        developers[i]=developer.getDetails(developer);
        i++;
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 90000.0, 2);
        Developer dev1 = new Developer("Bob", 70000.0, "Java");
        Developer dev2 = new Developer("Charlie", 75000.0, "Python");
        manager.addDeveloper(dev1);
        manager.addDeveloper(dev2);
        System.out.println(manager.getDetails(manager));
    }
}
