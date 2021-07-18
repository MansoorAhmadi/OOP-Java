package fr.epita.iam;

import java.util.Scanner;

public class MainMenu {

    public String proposeMenuAndGetAnswer(Scanner scanner){
        //the input is Scanner scanner - it's the same as we have String name in the parameters.
        //scope level 1
        System.out.println("What operation would you like to perform?");
        System.out.println("a. create an account");
        System.out.println("b. update your account");
        System.out.println("c. delete your account");
        System.out.println("q. quit");

        System.out.println("Your Choice: ");

        return scanner.nextLine();
        //it should return
    }
}



import java.util.Scanner;

public class AuthenticationConsoleActivity {

    public boolean AuthenticateUser(Scanner scanner){
        System.out.println("Username: ");
        String userName = scanner.nextLine();

        System.out.println("Password");
        String password = scanner.nextLine();

        return userName.equals("admin") && password.equals("password");
        //we are returning the hard coded username and password.
    }
}



package fr.epita.iam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //part one and two of the code begins here:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to this application.");
        System.out.println("Please type your username and password");

        System.out.println("Username: ");
        String userName = scanner.nextLine();

        System.out.println("Password: ");
        String password = scanner.nextLine();

        if (! new AuthenticationConsoleActivity().AuthenticateUser(scanner)){
            return;
        }

        System.out.println("You have successfully authenticated.");


        //part three of the code begins here:
        //Loop begins here:
        String answer = "";
        //we are initializing the string as empty

        do{
            //this level does not have access to the switch.


            answer = new MainMenu().proposeMenuAndGetAnswer(scanner);
            //we are instantiating the main menu by calling the proposeMenuAndGetAnswer method
            //with Scanner as an input. The scanner is already initialized.
            //we can use this method is re-usable. We can reuse it in other classes.
            //IT WAS NOT THE CASE WHEN WE HAD THE MENU HERE. WE DEFINED IT AS A METHOD IN A CLASS
            //IT CAN BE REUSED AS MANY TIMES AS WE WANT.

            //as soon as we see something that needs to be re-used more than once.
            //we create a class and an instance of that class.

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

