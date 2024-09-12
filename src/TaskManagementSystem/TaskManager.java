package TaskManagementSystem;

import java.util.LinkedList;

public class TaskManager {
    protected LinkedList<String> tasks;

    public TaskManager() {
        tasks= new LinkedList<>();
    }

    public static void main(String[] args) {
        TaskManager taskManager=new TaskManager();
        taskManager.addTask("Complete assignment", 1);
        taskManager.addTask("Attend meeting", 2);
        taskManager.addTask("Go grocery shopping", 3);
        taskManager.removeTask("Attend meeting");
        taskManager.removeTask("Exercise");
    }

    private void removeTask(String removeTask) {
    }

    private void addTask(String addTask, int i) {
        tasks.add(addTask);
    }
}
