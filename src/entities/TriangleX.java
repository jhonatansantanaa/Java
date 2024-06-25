package entities;

public class TriangleX {
    public double a;
    public double b;
    public double c;

    public double areaX() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void printAreaX() {
        System.out.println("Triangle x area: " + areaX());
    }
}
