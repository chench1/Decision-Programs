package quadratics;

/*
Author - Charles Chen
Date 11/10/21
Purpose - quadratics.Quadratic class that has the methods that calculate the roots of the quadratic based on the user inputs for
a, b and c in ax^2 + bx + c. Also contains methods that calculate the discriminant to see if there are real solutions.
 */

public class Quadratic {
    private double a, b ,c, discriminant, smallRoot, largeRoot;
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        discriminant = (Math.pow(b, 2) - (4 * a * c));
        calculateRoots();
    }

    public boolean hasSolutions() {

        return discriminant > 0;
    }

    private void calculateRoots() {
        if (discriminant > 0) {
            if ((-b + Math.sqrt(discriminant)) / (2* a) < (-b - Math.sqrt(discriminant)) / (2* a)) {
                smallRoot = (-b + Math.sqrt(discriminant)) / (2* a);
                largeRoot = (-b - Math.sqrt(discriminant)) / (2* a);
            } else {
                largeRoot = (-b + Math.sqrt(discriminant)) / (2* a);
                smallRoot = (-b - Math.sqrt(discriminant)) / (2* a);
            }
        } else if (discriminant == 0) {
            smallRoot = (-b + Math.sqrt(discriminant)) / (2* a);
        }

    }

    public double getSolution1() {
        return smallRoot;
    }

    public double getSolution2() {
        return largeRoot;
    }
}
