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
