//SIMPLIFIED VERSION OF USER AUTHENTICATION CONSOLE

package Authentication;

import java.util.Scanner;

public class LoginSimplified {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please, input your username");
        String username = myScanner.nextLine();

        System.out.println("Please, write your password");
        String password = myScanner.nextLine();

      //SIMPLIFICATION STEP
        boolean authentication = (username.equals("admin") && password.equals("password"));

        if (!authentication) {
            System.out.println("Invalid username and password");
            return;
        }
        System.out.println("You have logged in successfully!");

        String myAnswer = "";
        do {
            System.out.println("Welcome to this application");
            System.out.println("Please, choose the appropriate option");
            System.out.println("a: Create an account");
            System.out.println("b: Update your account");
            System.out.println("c: Remove your account");
            System.out.println("q: Quit");

            myAnswer = myScanner.nextLine();

            switch (myAnswer){
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
        } while(!"q".equals(myAnswer));

        myScanner.close();
    }
}
