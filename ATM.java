package atmexv;

import java.util.Scanner;

public class ATMexv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000, deposit, withdraw;

        // Simulated user ID and PIN (replace with actual authentication logic)
        int userId = 1234;
        int userPin = 0000;

        // Prompt user for ID and PIN
        System.out.println("Welcome to the ATM!");
        System.out.println("Please enter your User ID:");
        int inputUserId = sc.nextInt();
        System.out.println("Please enter your PIN:");
        int inputPin = sc.nextInt();

        // Check if user ID and PIN are correct
        if (inputUserId == userId && inputPin == userPin) {
            System.out.println("Authentication successful!");
            System.out.println();

            // Proceed with ATM functionalities
            while (true) {
                System.out.println("Press 1 to view balance");
                System.out.println("Press 2 for withdrawal");
                System.out.println("Press 3 for deposit");
                System.out.println("Press 4 to exit");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your current balance is " + balance);
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("Enter amount to withdraw:");
                        withdraw = sc.nextInt();

                        if (balance >= withdraw) {
                            balance -= withdraw;
                            System.out.println("Your updated balance is: " + balance);
                        } else {
                            System.out.println("Insufficient funds...!");
                        }
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("Enter amount to deposit:");
                        deposit = sc.nextInt();

                        balance += deposit;
                        System.out.println("The updated balance is: " + balance);
                        System.out.println();
                        break;

                    case 4:
                        System.out.println("Thank you, GOODBYE!!");
                        System.exit(0);
                        break;
                }
            }
        } else {
            // Authentication failed
            System.out.println("Authentication failed. Please try again.");
        }
    }
}
