package et.edu.aait.toDoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
        	System.out.println("================");
            System.out.println("Welcome! Choose your preference! ");
            System.out.println("1. Add a Task");
            System.out.println("2. View a Task");
            System.out.println("3. Mark as completed");
            System.out.println("4. Close");
            
            System.out.print("What do you want to do? ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    
                    toDoList.addTask(new Task(title, description));
                    System.out.println("Task added successfully.");
                    
                    break;

                case 2:
                    System.out.println("ToDo List:");
                    toDoList.viewList();
                    break;

                case 3:
                    System.out.print("Which task do you want to mark as completed? ");
                    String task = scanner.nextLine();
                    toDoList.markAsCompleted(task);
                    
                    break;

                case 4:
                    System.out.println("Bye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }

            System.out.println("================"+"\n");
        }
    }
}
