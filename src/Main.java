import entities.TriangleX;
import entities.TriangleY;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TriangleX x = new TriangleX();
        TriangleY y = new TriangleY();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of Triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of Triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.areaX();
        double areaY = y.areaY();
        x.printAreaX();
        y.printAreaY();

        if (areaX > areaY) {
            System.out.println("AreaX é maior que a AreaY");
        } else {
            System.out.println("AreaY é maior que a AreaX");
        }

    }
}