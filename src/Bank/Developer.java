package Bank;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, Double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage=programmingLanguage;
    }


    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String getDetails() {
        return "Developer{" +"name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
