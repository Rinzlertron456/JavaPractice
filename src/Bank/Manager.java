package Bank;

import java.util.Arrays;

public class Manager extends Employee{
    private int numdevs;
    private static Developer[] developers;

    public int getNumdevs() {
        return numdevs;
    }

    public void setNumdevs(int numdevs) {
        this.numdevs = numdevs;
    }

    public Manager(String name, Double salary, int numdevs) {
        super(name, salary);
        developers=new Developer[numdevs];
    }
    public void addDeveloper(Developer developer){
        for (int i = 0; i < numdevs; i++) {
            developers[i]=developer;

        }

    }

    @Override
    public String getDetails() {
        return "Manager{" +
                "numdevs=" + numdevs +
                ", developers=" + Arrays.toString(developers) +
                '}';
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
