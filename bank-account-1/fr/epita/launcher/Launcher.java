package fr.epita.launcher;

import fr.epita.datamodel.Customer;
import fr.epita.datamodel.SavingAccount;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        System.out.println("Hello, welcome to this application");
        System.out.println("Please, create an account");
        System.out.println("Username");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Address");
        String address = scanner.nextLine();

        Customer customer = new Customer(name, address);

        Double initialBalance = null;
        Double initialInterestRate = 0.05;

        try {
            System.out.println("What is your initial balance for saving? ");
            initialBalance = scanner.nextDouble();

            System.out.println("Please, input an interest rate for saving: ");
            initialInterestRate = scanner.nextDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (initialBalance == null) {
            return;
        }

        SavingAccount savingAccount = new SavingAccount(initialInterestRate, initialBalance);
        System.out.println("How much cash would you like to withDraw?");

        try {
            int cash = scanner.nextInt();
            savingAccount.withDraw(cash);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        double interest = savingAccount.computeInterest();
        System.out.println(interest);

        scanner.close();
    }
};
