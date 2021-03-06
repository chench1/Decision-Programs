package grade;
/*
Author - Charles Chen
Date - 11/10/2021
Purpose - The user inputs their letter grade and this program will translate the letter grade into a numerical grade.
*/

import java.util.Map;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program will convert the letter grade into a numerical grade. Valid inputs include 'A', 'B', 'C', 'D' and 'F'. Please enter a letter grade: ");
        String input = scan.nextLine();
        input = input.toUpperCase();
        if (input.startsWith("A") || input.startsWith("B") || input.startsWith("C") || input.startsWith("D") || (input.startsWith("F"))) {
            if ((input.charAt(1) == '+' || input.charAt(1) == '-') && input.startsWith("F")) {
                System.out.println("Bad input. F- or F+ is not a valid input");
                return;
            }
            System.out.println("The letter grade entered converted into its numerical value is: " + getLetterGrade(input));
        } else {
            System.out.println("Bad input");
        }
    }

    public static double getLetterGrade(String grade) {
        Map<Character, Double> gradeToNumber =  setMap();
        if (grade.length() == 1) {
            return gradeToNumber.get(grade.charAt(0));
        }
        if (grade.charAt(1) == '+') {
            if (grade.charAt(0) == 'A') {
                return 4.0;
            }
            return gradeToNumber.get(grade.charAt(0))+ .3;
        } else if (grade.charAt(0) == 'F') {
            return 0;
        } else {
            return gradeToNumber.get(grade.charAt(0))-.3;
        }
    }

    public static Map<Character, Double> setMap() {
        return Map.of(
                'A', 4.0,
                'B', 3.0,
                'C', 2.0,
                'D', 1.0,
                'F', 0.0
        );
    }
}
