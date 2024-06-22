package POO;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner stdin = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        xA = stdin.nextDouble();
        xB = stdin.nextDouble();
        xC = stdin.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yA = stdin.nextDouble();
        yB = stdin.nextDouble();
        yC = stdin.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double zoneX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

         p = (yA + yB + yC) / 2.0;
        double zoneY = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        stdin.close();

        System.out.println("Zone X: %.4f%n" + zoneX);
        System.out.println("Zone Y: %.4f%n" + zoneY);

        if (zoneX > zoneY) {
            System.out.println("Large Zone: " + zoneX);
        } else {
            System.out.println("Small Zone: " + zoneY);
        }

    }

}
