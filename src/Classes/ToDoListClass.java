package Classes;

import java.util.ArrayList;

public class ToDoListClass {
    private ArrayList<TaskClass> tasks;

    public ToDoListClass() {
        tasks = new ArrayList<>();
    }

    public void addTask(TaskClass task){
        tasks.add(task);
        System.out.println("Task added successfully");
    }


    public void removeTask(int id) {
        for (TaskClass task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
                System.out.println("Task removed successfully");
                return;
            }
        }
        System.out.println("Task not found");
    }


    public void viewTaskStatus(int id) {
        for(TaskClass task : tasks) {
            if (task.getId() == id) {
                if (task.isCompleted() == false){
                    System.out.println("The Status of the Task is: Not Completed");
                } else {
                    System.out.println("The Status of the Task is:  Completed");
                }
                return;
            }
        }
        System.out.println("Task not found");
    }


    public void updateTaskStatus(int id) {
        for(TaskClass task :tasks) {
            if(task.getId() == id){
                task.setCompleted(true);
                System.out.println("You maked the task completed !");
                return;
            }
        }
        System.out.println("Task not found");
    }



    public void viewAllTasks(){
        for (TaskClass task : tasks) {
            System.out.println(task);
        }
        System.out.println("All Tasks Displayed");
    }
}
