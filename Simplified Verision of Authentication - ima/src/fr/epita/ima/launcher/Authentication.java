package fr.epita.ima.launcher;

import javax.swing.*;
import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {

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

        scanner.close();
    }
}
