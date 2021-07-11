package fr.epita.ima.launcher;

import javax.swing.*;
import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {

        //part one and two of the code begins here:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to this application.");
        System.out.println("Please type your username and password");

        System.out.println("Username: ");
        String userName = scanner.nextLine();

        System.out.println("Password: ");
        String password = scanner.nextLine();

        //initializing the boolean variable to false.
        //if set the hard coded value to authenticated variable
        boolean authenticated = userName.equals("admin") && password.equals("password");

        //if it's not the value from authenticated. It is invalid.
        if(! authenticated){
            System.out.println("Invalid username or password");
            return;
        }

        System.out.println("You have successfully authenticated.");
        //part three of the code begins here:
        //Loop begins here:
        String answer = "";
        do{
            //this level does not have access to the switch.

        System.out.println("What operation would you like to perform?");
        System.out.println("a. create an account");
        System.out.println("b. update your account");
        System.out.println("c. delete your account");
        System.out.println("q. quit");

        System.out.println("What's your choice: ?");

        answer = scanner.nextLine();
        //we cannot have the String answer variable stored inside the do.

            switch (answer){
                case "a":
                    System.out.println("You chose to create an account");
                    System.out.println(" ");
                    break;
                case "b":
                    System.out.println("You chose to update your account");
                    break;
                case "c":
                    System.out.println("You chose to delete your account");
                    break;
                case "q":
                    System.out.println("goodbye!");
                    break;
                default:
                    System.out.println("Input not recognized!" + answer);
            } //switch ends here
            //do ends here

        } while(!"q".equals(answer));
        //end of while

        scanner.close();
    }
}
