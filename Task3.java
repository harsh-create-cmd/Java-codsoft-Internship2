import java.util.Scanner;
import java.io.*;

public class ATM {
    private double balance;
    private Scanner scanner;

    // Constructor to initialize balance and scanner
    public ATM() {
        balance = 0.0; // Initial balance is set to zero
        scanner = new Scanner(System.in);
    }

    // Method to display the ATM menu
    private void showMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
    }

    // Method to check the balance
    private void checkBalance() {
        System.out.printf("Current balance: $%.2f\n", balance);
    }

    // Method to deposit funds into the account
    private void depositFunds() {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.printf("$%.2f deposited successfully.\n", amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw funds from the account
    private void withdrawFunds() {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("$%.2f withdrawn successfully.\n", amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to start the ATM interface
    public void start() {
        boolean exit = false;

        while (!exit) {
            showMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositFunds();
                    break;
                case 3:
                    withdrawFunds();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close(); // Close the scanner before exiting
    }

    // Main method to run the ATM interface
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }
}