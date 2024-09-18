package TaskManagementSystem;

import java.util.LinkedList;
import java.util.List;

class Task{
    protected String description;
    protected int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}

public class TaskManager {
    LinkedList<Task> tasks=new LinkedList<>();
    public static void main(String[] args) {
        TaskManager taskManager=new TaskManager();
        taskManager.addTask("Complete assignment", 1);
        taskManager.addTask("Attend meeting", 2);
        taskManager.addTask("Go grocery shopping", 3);
        taskManager.removeTask("Attend meeting");
        taskManager.removeTask("Exercise");
        taskManager.getAllTasks();
        TaskManager taskManager1=new TaskManager();
        taskManager1.addTask("Study for exams", 1);
        taskManager1.addTask("Clean the house", 2);
        List<Task> tasks1 = taskManager1.getAllTasks();
    }

    private void removeTask(String description) {
        for (Task task:tasks){
            if(task.getDescription().equals(description)) {
                System.out.println("Removed task: "+description);
                tasks.remove(task);
            }
            else{
                System.out.println("Task not found: "+description);
            }
            break;
        }
    }

    private List<Task> getAllTasks() {
        for (Task task:tasks){
            System.out.println("Task[Description: "+task.getDescription()+", Priority: "+task.getPriority()+"]");
        }
        return tasks;
    }

    private void addTask(String description, int priority) {
        Task task=new Task(description,priority);
        tasks.add(task);
        System.out.println("Added task: "+task.getDescription());
    }
}
