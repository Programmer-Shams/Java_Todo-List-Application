import Classes.TaskClass;
import Classes.ToDoListClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoListClass toDoListClass = new ToDoListClass();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;


        while (!exit) {
            System.out.println("Welcome to ToDo List Application");
            System.out.println("1. Add New ToDo");
            System.out.println("2. Display All ToDo");
            System.out.println("3. Delete a ToDo");
            System.out.println("4. View A ToDo Completion Status");
            System.out.println("5. Update a ToDo Completion Status");
            System.out.println("6. Exit");

            System.out.println("Please select your option: ");
            int option = scanner.nextInt();
            scanner.nextLine();


            switch (option) {
                case 1:
                    System.out.println("Enter ToDo ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter ToDo Title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter ToDo Description: ");
                    String description = scanner.nextLine();
                    TaskClass task = new TaskClass(id, title, description);
                    toDoListClass.addTask(task);
                    break;
                case 2:
                    System.out.println("These are Your Tasks: ");
                    toDoListClass.viewAllTasks();
                    break;


                case 3:
                    System.out.println("Enter the ID of the ToDo To Delete: ");
                    int DeleteID = scanner.nextInt();
                    toDoListClass.removeTask(DeleteID);
                    break;

                case 4:
                    System.out.println("Enter the ID of the ToDo To View Completion Status: ");
                    int viewCompletionStatus = scanner.nextInt();
                    toDoListClass.viewTaskStatus(viewCompletionStatus);
                    break;

                case 5:
                    System.out.println("Enter the ID of the ToDo To Update Completion Status: ");
                    int updateCompletionStatus = scanner.nextInt();
                    toDoListClass.updateTaskStatus(updateCompletionStatus);
                    break;


                case 6:
                    exit = true;

                default:
                    System.out.println("Invalid Option, please try again");

            }
        }
        scanner.close();
        System.out.println("Thank you for using ToDo List Application");

    }
}
