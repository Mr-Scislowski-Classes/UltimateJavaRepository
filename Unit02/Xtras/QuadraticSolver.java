package Unit02.Xtras;
import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quadratic Solver");
        System.out.println("Enter a, b, and c for ax^2 + bx + c = 0");
        System.out.print("a: ");
        double a = scan.nextDouble();
        System.out.print("b: ");
        double b = scan.nextDouble();
        System.out.print("c: ");
        double c = scan.nextDouble();

        double solution1 = (-b + Math.sqrt(b*b - 4 * a * c)) / (2 * a);
        double solution2 = (-b - Math.sqrt(b*b - 4 * a * c)) / (2 * a);

        System.out.println("Solutions are: " + solution1 + ", " + solution2);
        scan.close();

    }
}
