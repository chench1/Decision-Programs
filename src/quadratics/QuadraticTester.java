package quadratics;

/*
Author - Charles Chen
Date - 11/10/21
Purpose - Asks the user for 3 numbers which would be put in the equation ax^2 + bx + c and will replace the unknowns, a, b and c.
The program then will find the roots of the equation, if there are no real roots, then the program will tell the user there are no
real roots. If there are real roots, then the program will tell the user the roots of the equation.
 */

import java.util.Scanner;

public class QuadraticTester {
    public static void main(String[] args) {
        System.out.println("Based on the equation ax^2 + bx + c, you will enter 3 values for a, b and c in the equation. Please enter the first number: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Please enter the second number: ");
        int b = scan.nextInt();
        System.out.println("Please enter the third number: ");
        int c = scan.nextInt();
        Quadratic quadratic = new Quadratic(a, b, c);
        if (!quadratic.hasSolutions()) {
            System.out.println("This quadratic has no real solutions");
        } else {
            if (quadratic.getSolution1() == quadratic.getSolution2()) {
                System.out.println("This quadratics only solution is " + quadratic.getSolution1());
            } else {
                System.out.println("The two solutions are: " + quadratic.getSolution1() + " and " + quadratic.getSolution2());
            }
        }
    }
}
