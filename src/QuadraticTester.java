/*

 */

import java.util.Scanner;

public class QuadraticTester {
    public static void main(String[] args) {
        System.out.println("You will enter 3 values total. Please enter the first number: ");
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
