//IF Else If STATEMENTS

package IfElseStatement;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        System.out.println("Please, choose your favourite game:");
        System.out.println("a: Space Invaders");
        System.out.println("b: Pac Man");
        System.out.println("c: Street Fighters");

        System.out.println("What do you want to choose? a|b|c");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if ("a".equals(answer)){
            System.out.println("Welcome to Space Invaders");
        }else if ("b".equals(answer)){
            System.out.println("Welcome to Pac Man");
        }else if ("c".equals(answer)){
            System.out.println("Welcome to Street Fighters");
        }else {
            System.out.println("Invalid Input");
        }
        scanner.close();
    }
}


//SWTICH CASE
package IfElseStatement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        System.out.println("Welcome to this application");
        System.out.println("Please, choose a game!");
        System.out.println("a: Space Invaders");
        System.out.println("b: Pac Man");
        System.out.println("c: Street Fighters");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        switch (answer){
            case "a":
                System.out.println("Welcome to Space Invaders");
            case "b":
                System.out.println("Welcome to Pac Man");
            case "c":
                System.out.println("Welcome to Street Fighters");
            default:
                System.out.println("Invalid Input");
        }
        scanner.close();
    }
}
