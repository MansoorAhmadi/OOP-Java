package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.SavingAccount;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        System.out.println("Hello, welcome to this application");
        System.out.println("please, create the customer account details");
        System.out.println("user name: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("address:" );
        String address = scanner.nextLine();

        Customer customer = new Customer(name, address);

        //int initialBalance = 22980; we are not using the hardcoded initialised amount
        //double initialInterestRate = 0.05;

        //double initialBalance = 0;
        //if we have double with a small 'd' keyword. It's the primitive type.
        //the problem we will run is that, we set the initial balance to 0 and we have an if condition
        //the if condition says. if the balance is 0 than exit. It contradicts
        //we initialised it to 0 - double initialBalance = 0; we also asked the user to enter a balance, if he/she enters 0
        //and our if condition. What is the solution here?
        //the solution is to use a class type instead of primitive type using a capital 'D' for Double.
        //it's the advantage that the primitive type do not offer.
        //with the class type we are able to make the difference between default or unset values and set values - initialised and uninitialised values.
        Double initialBalance = null;

        //this is now an object - an instance. As an instance if can stay uninitialised. The default value can stay null.
        //the initialInterestRate with a class type which is a capital 'D' Double keyword was highlighted as an issue.
        //it's because it's taking twice memory size and the IDE suggest to use primitive type 'double'.
        Double initialInterestRate = 0.05;

        //try and catch is like unit testing. You do the execution and check the result
        //you perform another operation. You keep doing it. Result and code. Result and code.
        //if you pass the try test. Than, you can go to the next execution steps
        //if you are not able to pass the try test, you will end up in catch with the characteristic of what's going wrong.
        //it's a very good practice to follow what is going on.
        //same remarks for the interestRate as well. It should go through a test unit. If it passes it will execute next
        try{
            System.out.println("Please, input an initial balance for your savings: ");
            initialBalance = scanner.nextDouble();
            System.out.println("Please, input an interest rate for your savings: ");
            initialInterestRate = scanner.nextDouble();
        }catch (Exception e) {
            e.printStackTrace();
        }
        //check if the values are correct.
        if(initialBalance == null){
            return; //?
        }

        // executing the SavingAccount class by creating an instance and object
        // after modifying it.
        //this SavingAccount was the empty instance after the constructor.
        SavingAccount savingAccount = new SavingAccount(initialBalance, initialInterestRate);

        System.out.println("What amount would like to withdraw?");
        try{
            //the try & catch in here depends on the user input & operating system as well.
            //whatever that could go wrong and not managed by the program.
            //the user input could be wrong.
            //we can write a loop to make the user re-try or keep trying the operation.
            int amount = scanner.nextInt();
            savingAccount.withDraw(amount);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        //double interest = savingAccount.computeInterest();

        scanner.close();
        //whatever is not memory, need to be managed in java. If you open 500 programs.
        //it's not your program in trouble. It's the operating system.
        //whenever you open a resource. You must close it.
    }
}