import java.time.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

/**
 * ExpenseTracker is the main application class.
 * It provides a simple menu system to add and view expenses.
 */
public class ExpenseTracker {
    // List to hold all expense objects
    private static ArrayList<Expense> expenses = new ArrayList<>();

    // Scanner object for user input
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Main method: entry point of the program.
     * Displays a menu to interact with the expense tracker.
     */
    public static void main(String[] args) {
        boolean running = true;

        // Loop until user chooses to exit
        while (running) {
            System.out.println("\n--- Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. Show All Expenses");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    showExpenses();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

    /**
     * Prompts the user to enter expense details and adds it to the list.
     */
    private static void addExpense() {
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Enter category (e.g. Food, Travel): ");
        String category = scanner.nextLine();

        // Create new Expense object and add to list
        Expense expense = new Expense(amount, category, LocalDate.now());
        expenses.add(expense);

        System.out.println("✅ Expense added: " + expense);
    }

    /**
     * Displays all expenses currently stored in memory.
     */
    private static void showExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.");
        } else {
            System.out.println("\n--- All Expenses ---");
            for (Expense e : expenses) {
                System.out.println(e);
            }
        }
    }
}
