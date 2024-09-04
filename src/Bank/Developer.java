package Bank;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee{
    private String name;
    private Double salary;
    private String programmingLanguage;

    public Developer(String name, Double salary, String programmingLanguage) {
        super(name, salary);
        this.name=name;
        this.salary=salary;
        this.programmingLanguage=programmingLanguage;
    }

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

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }


    public String getDetails() {
        return "Name: '" + name + '\'' +
                ", Salary: " + salary +
                ", Programming Language: '" + programmingLanguage ;
    }
}
