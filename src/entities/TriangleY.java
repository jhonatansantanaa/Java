package entities;

public class TriangleY {
    public double a;
    public double b;
    public double c;

    public double areaY() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    public void printAreaY() {
        System.out.println("Triangle Y area: " + areaY());
    }
}
