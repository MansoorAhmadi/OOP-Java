package Authentication;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, input your username");
        String username = scanner.nextLine();

        System.out.println("Please, write your password");
        String password = scanner.nextLine();

        boolean authentication = false;

        if (username.equals("admin") && password.equals("password")){
            authentication = true;
        } else{
            System.out.println("Failed to login");
            return;
        }
        System.out.println("You are logged in successfully!");

        String answer = "";
        do {
            System.out.println("Welcome to this application");
            System.out.println("Please, choose the appropriate option");
            System.out.println("a: Create an account");
            System.out.println("b: Update your account");
            System.out.println("c: Remove your account");
            System.out.println("q: Quit");

            answer = scanner.nextLine();

            switch (answer){
                case "a":
                    System.out.println("You chose to create an account");
                    break;
            case "b":
                    System.out.println("You chose to update your account");
                    break;
            case "c":
                    System.out.println("You chose to remove your account");
                    break;
            case "q":
                    System.out.println("Bye...");
                    break;
            default:
                    System.out.println("Input not recognized");
            }
        } while(!"q".equals(answer));
        
        scanner.close();
    }
}


//OUTPUT
//Please, input your username
//        admin

//        Please, write your password
//        password

//        You are logged in successfully!

//        Welcome to this application
//        Please, choose the appropriate option

//        a: Create an account
//        b: Update your account
//        c: Remove your account
//        q: Quit

//        a
//        You chose to create an account

//        Welcome to this application
//        Please, choose the appropriate option

//        a: Create an account
//        b: Update your account
//        c: Remove your account
//        q: Quit

//        b
//        You chose to update your account

//        Welcome to this application
//        Please, choose the appropriate option

//        a: Create an account
//        b: Update your account
//        c: Remove your account
//        q: Quit
//        c
//        You chose to remove your account

//        Welcome to this application
//        Please, choose the appropriate option

//        a: Create an account
//        b: Update your account
//        c: Remove your account
//        q: Quit

//        d
//        Input not recognized

//        Welcome to this application
//        Please, choose the appropriate option

//        a: Create an account
//        b: Update your account
//        c: Remove your account
//        q: Quit

//        q
//        Bye...
