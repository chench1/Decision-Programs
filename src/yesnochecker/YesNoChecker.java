package yesnochecker;

/*
Author - Charles Chen
Date - 11/10/2021
Purpose - Asks the user if they want to continue the program. If the user types 'N', then the program will print out a statement
saying 'Program Terminating'. If the user types ‘Y’, ‘Yes’, ‘OK’, ‘Sure’, or 'Why not' then the program will print out a statement
saying 'OK'. Caps does not matter for this program and if the user does not enter a valid statement then the program will print
out 'Bad input'.
*/

import java.util.Scanner;

public class YesNoChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program will ask if you want the program to continue. Do you want to continue?");
        String input = scan.nextLine();
        if (input.equalsIgnoreCase("N")) {
            System.out.println("Program Terminating");
        } else if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("OK") || input.equalsIgnoreCase("Sure")) {
            System.out.println("OK");
        } else {
            System.out.println("Bad input");
        }
    }

}
