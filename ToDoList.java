/*
 *  To Do List Console Application
 *  Developed by Sathira Sri Sathsara 
 *  Github - sathirasrisathsara.github.io
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    // Main Method
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Welcome to the To-Do List Application!");
        System.out.println("");
        System.out.println(
                "\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557\u2591\u2588\u2588\u2588\u2588\u2588\u2557\u2591\u2003\u2003\u2588\u2588\u2588\u2588\u2588\u2588\u2557\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2557\u2591\u2003\u2003\u2588\u2588\u2557\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2557\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2557\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557");
        System.out.println(
                "\u255A\u2550\u2550\u2588\u2588\u2554\u2550\u2550\u255D\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2003\u2003\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2003\u2003\u2588\u2588\u2551\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2551\u2588\u2588\u2554\u2550\u2550\u2550\u2550\u255D\u255A\u2550\u2550\u2588\u2588\u2554\u2550\u2550\u255D");
        System.out.println(
                "\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2551\u2003\u2003\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2551\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2551\u2003\u2003\u2588\u2588\u2551\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2551\u255A\u2588\u2588\u2588\u2588\u2588\u2557\u2591\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2591");
        System.out.println(
                "\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2551\u2003\u2003\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2551\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2551\u2003\u2003\u2588\u2588\u2551\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u255A\u2550\u2550\u2550\u2588\u2588\u2557\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2591");
        System.out.println(
                "\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2591\u255A\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u2003\u2003\u2588\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u255A\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u2003\u2003\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557\u2588\u2588\u2551\u2588\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2591");
        System.out.println(
                "\u2591\u2591\u2591\u255A\u2550\u255D\u2591\u2591\u2591\u2591\u255A\u2550\u2550\u2550\u2550\u255D\u2591\u2003\u2003\u255A\u2550\u2550\u2550\u2550\u2550\u255D\u2591\u2591\u255A\u2550\u2550\u2550\u2550\u255D\u2591\u2003\u2003\u255A\u2550\u2550\u2550\u2550\u2550\u2550\u255D\u255A\u2550\u255D\u255A\u2550\u2550\u2550\u2550\u2550\u255D\u2591\u2591\u2591\u2591\u255A\u2550\u255D\u2591\u2591\u2591");
        System.out.println("");
        System.out.println("Developed By Sathira Sri Sathsara");
        System.out.println("");

        // Array lists
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();

        // Varibles
        int userChoice;

        do {
            userChoice = menu();

            if (userChoice == 1) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("");
                System.out.println("Add Task:");

                while (true) {
                    System.out.print("Enter task title (or type 'done' to finish): ");
                    String title = scanner.nextLine();
                    String TaskStatus = "INCOMPLEATE";

                    if (title.equalsIgnoreCase("done")) {
                        System.out.println("");
                        System.out.println("Task added successfully!");
                        System.out.println("");
                        break;
                    } else {
                        tasks.add(title);
                        status.add(TaskStatus);
                    }
                }
            } else if (userChoice == 2) {
                System.out.println("");
                System.out.println("View Tasks: ");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println("[" + status.get(i) + "] " + tasks.get(i));
                }
            } else if (userChoice == 3) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Mark Task as Completed:");
                System.out.println("You have " + tasks.size() + " tasks");
                System.out.print("Enter the task number to mark as completed: ");
                int option = scanner.nextInt();
                int UerStatus = option;
                int TaskNo = tasks.size();

                if (option <= TaskNo) {
                    option -= 1;
                    status.set(option, "COMPLETED");
                    System.out.print("Task " + UerStatus + " has completed !!");
                } else {
                    System.out.println("Pleace enter valid task number");
                }
            } else if (userChoice == 4) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Delete Task:");
                System.out.println("You have " + tasks.size() + " tasks");
                System.out.print("Enter the task number to delete: ");
                int UserOption = scanner.nextInt();
                int UserTask = UserOption;
                int TaskNo = tasks.size();

                if (UserOption <= TaskNo) {
                    UserOption -= 1;
                    status.remove(UserOption);
                    tasks.remove(UserOption);
                    System.out.println("You have successfully deleted task number " + UserTask + " now you have only "
                            + tasks.size() + " tasks left.");
                }
            }
        } while (userChoice != 5);

        System.out.println("Exiting the To-Do List Application. Goodbye!");
    }

    // Menu Method
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Main Menu:");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.println("");
        System.out.print("Please enter your choice: ");
        int choice = scanner.nextInt();
        System.out.println("");
        scanner.nextLine();
        return choice;
    }

}
