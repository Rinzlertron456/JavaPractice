package UniqueStudentNames;

import java.util.HashSet;

public class UniqueStudents {
    private HashSet<String> students;

    public UniqueStudents() {
        students=new HashSet<>();
    }

    public static void main(String[] args) {
        UniqueStudents manager=new UniqueStudents();
        manager.addName("Alice");
        manager.addName("Bob");
        manager.addName("Alice");
        System.out.println(manager.studentNames());
        System.out.println("Contains Alice? " + manager.containsName("Alice"));
        System.out.println("Contains Charlie? " + manager.containsName("Charlie"));
        manager.removeName("Bob");
        manager.removeName("Charlie");
        System.out.println("All student names: "+manager.studentNames());
    }

    private void removeName(String student) {
        if(students.contains(student)) {
            students.remove(student);
            System.out.println("Removed name: "+student);
        }
        else System.out.println("Name not found: "+student);
    }

    private boolean containsName(String student) {
        return students.contains(student);
    }

    private HashSet<String> studentNames() {
        return students;
    }

    private void addName(String student) {
        if(students.contains(student)) System.out.println("Name already exists: "+student);
        else {
            students.add(student);
            System.out.println("Added name: "+student);
        }
    }
}
