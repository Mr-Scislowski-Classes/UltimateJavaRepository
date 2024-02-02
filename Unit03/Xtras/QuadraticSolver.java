package Unit03.Xtras;

import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficients of a quadratic equation");

        while (true) {
            try {
                System.out.print("a - ");
                double a = Double.parseDouble(scanner.next());
                System.out.print("b - ");
                double b = Double.parseDouble(scanner.next());
                System.out.print("c - ");
                double c = Double.parseDouble(scanner.next());
                double disc = Math.pow(b, 2) - 4 * a * c;
                if (disc < 0) {
                    System.out.println("No real zeros");
                } else if (disc == 0) {
                    System.out.println("One real zero");
                    System.out.println("x = " + (b * -1 + Math.sqrt(disc))/(2 * a));
                } else {
                    System.out.println("Two real zeros");
                    System.out.println("x = " + (b * -1 + Math.sqrt(disc))/(2 * a));
                    System.out.println("x = " + (b * -1 - Math.sqrt(disc))/(2 * a));
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input doubles, please");
            }
        }
        scanner.close();
    }
}
// javac Unit03\Xtras\QuadraticSolver.java
// java Unit03.Xtras.QuadraticSolver