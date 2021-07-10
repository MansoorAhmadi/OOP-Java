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
        boolean authenticated = false;

        if(userName.equals("admin") && password.equals("password")){
            authenticated = true;
        } else {
            System.out.println("Invalid username or password");
            return;
        }
        System.out.println("You have successfully authenticated.");

        scanner.close();
    }
}
