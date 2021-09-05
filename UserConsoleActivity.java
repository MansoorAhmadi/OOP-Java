//MAIN MENU
package ConsoleActivity;

import java.util.Scanner;

public class MainMenu {

    public String mainMenu(Scanner scanner){

        System.out.println("What operation would you like to perform?");
        System.out.println("a: Create an account");
        System.out.println("b: Update an account");
        System.out.println("c: Delete an account");
        System.out.println("q: Quit");
        System.out.println("What's your choice: ");

        return scanner.nextLine();
    }
}



//USER CREDENTIAL
package ConsoleActivity;

import java.util.Scanner;

public class AuthenticationConsoleActivity {

    public boolean userAuthentication(Scanner scanner) {

        //IamLog.info("the user is entering the application");
        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        //if user exists and the provided password is matching the expected one
        return username.equals("admin") && password.equals("password");
    }
}




//MAIN IMPLEMENTATION
package ConsoleActivity;

import java.util.Scanner;

public class ConsoleActivityLauncher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to this application");
        System.out.println("Please, enter your credentials");

        if (!new AuthenticationConsoleActivity().userAuthentication(scanner)){
            System.out.println("Wrong username or password, bye!");
            return;
        }
        System.out.println("You're logged in!");
        String answer = "";

        do {
            answer = new MainMenu().mainMenu(scanner);

            switch (answer){
                case "a":
                    System.out.println("You chose to create an account");
                    break;

                case "b":
                    System.out.println("You chose to update an account");
                    break;

                case "c":
                    System.out.println("You chose to delete an account");
                    break;

                case "q":
                    System.out.println("Bye..");
                    break;

                default:
                    System.out.println("Invalid Input, try again!");
            }
            //loop to here, and exit if the answer is equal to q
        } while (!"q".equals(answer));
        scanner.close();
    }
}



//OUTPUT - First Execution
//Welcome to this application
//Please, enter your credentials
//Enter username:
//mansoor

//Enter password:
//password

//Wrong username or password, bye!


//OUTPUT - Second Execution
//Welcome to this application
//Please, enter your credentials
//Enter username:
//admin
//Enter password:
//password
//You're logged in!

//What operation would you like to perform?
//a: Create an account
//b: Update an account
//c: Delete an account
//q: Quit

//What's your choice: 
//c
//You chose to delete an account

//What operation would you like to perform?
//a: Create an account
//b: Update an account
//c: Delete an account
//q: Quit

//What's your choice: 
//d
//Invalid Input, try again!

//What operation would you like to perform?
//a: Create an account
//b: Update an account
//c: Delete an account
//q: Quit

//What's your choice: 
//q
//Bye...
