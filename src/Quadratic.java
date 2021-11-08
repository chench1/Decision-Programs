public class Quadratic {
    private double a, b ,c, discriminant, smallRoot, largeRoot;
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        discriminant = (Math.pow(b, 2) - (4 * a * c));
    }

    public boolean hasSolutions() {

        return discriminant > 0;
    }

    private void calculateRoots() {
        if ((-b + Math.sqrt(discriminant)) / (2* a) < (-b - Math.sqrt(discriminant)) / (2* a)) {
            smallRoot = (-b + Math.sqrt(discriminant)) / (2* a);
            largeRoot = (-b - Math.sqrt(discriminant)) / (2* a);
        }
    }

    public double getSolution1() {
        return smallRoot;
    }

    public double getSolution2() {
        return largeRoot;
    }
}
