package Bank;

import java.util.ArrayList;
import java.util.Arrays;

public class Manager extends Employee{
    private final String name;
    private final Double salary;
    private int numdevs;
    private int i=0;

    private static String[] developers;
    public Manager(String name, Double salary, int numdevs) {
        super(name, salary);
        this.name=name;
        this.salary=salary;
        developers=new String[numdevs];
    }

    public void addDeveloper(Developer developer){
        developers[i]=developer.getDetails();
        i++;
    }

    public String getDetails() {
        return "Name: " + name + " Salary: " + salary +
                "\nManaging Developers:\n" + Arrays.toString(developers);
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 90000.0, 2);
        Developer dev1 = new Developer("Bob", 70000.0, "Java");
        Developer dev2 = new Developer("Charlie", 75000.0, "Python");
        manager.addDeveloper(dev1);
        manager.addDeveloper(dev2);
        System.out.println(manager.getDetails());
    }
}
