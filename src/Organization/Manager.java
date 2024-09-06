//Problem 9: Employee Management System
//Create a class hierarchy for an employee management system. There should be a base class
//Employee and derived classes Manager and Developer. Each employee has a name and a salary. A
//manager can manage multiple developers.
//1. Employee Class:
//o Fields: name (String), salary (double)
//o Methods: getDetails() (returns a string containing the employee details)
//2. Manager Class:
//o Inherits from Employee
//o Additional Field: developers (Developer[] developers)
//o Methods: addDeveloper(Developer developer), getDetails() (overrides the
//method from Employee to include managed developers)
//3. Developer Class:
//o Inherits from Employee
//o Additional Field: programmingLanguage (String)
//o Methods: getDetails() (overrides the method from Employee to include
//programming language)
//Requirements:
//• Create instances of Manager and Developer, and add developers to a manager.
//• Print the details of managers and developers using the getDetails() method.
//• Main class to test the functionality
//Sample Input 1:
//Manager manager = new Manager("Alice", 90000, 2);
//Developer dev1 = new Developer("Bob", 70000, "Java");
//Developer dev2 = new Developer("Charlie", 75000, "Python");
//manager.addDeveloper(dev1);
//manager.addDeveloper(dev2);
//System.out.println(manager.getDetails());
//Sample Output 1:
//Name: Alice, Salary: 90000.0, Managing Developers:
// Name: Bob, Salary: 70000.0, Programming Language: Java
// Name: Charlie, Salary: 75000.0, Programming Language: Python
package Organization;

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
