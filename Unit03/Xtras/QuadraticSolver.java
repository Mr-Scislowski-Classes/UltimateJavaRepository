package Unit03.Xtras;
import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the a coefficient: ");
        double a = s.nextDouble();
        System.out.println("Please enter the b coefficient: ");
        double b = s.nextDouble();
        System.out.println("Please enter the c coefficient: ");
        double c = s.nextDouble();
        double result1;
        double result2;
        if (Math.sqrt(Math.pow(b, 2) - (4 * a * c)) >0){
            result1 = (- b + Math.sqrt(Math.pow(b, 2)) - (4 * a * c))/(2 * a);
            result2 = (- b - Math.sqrt(Math.pow(b, 2)) - (4 * a * c))/(2 * a);
            System.out.println("The solutions to " + a + "x^2 + " + b + "x + "+ c + " are" +" x=" + result1 + " 5and" +" x=" + result2);

        } else if (Math.sqrt(Math.pow(b, 2) - (4 * a * c)) == 0){
            result1 = (- b)/ (2 *a);
            System.out.println("The only solution to " + a + "x^2 + " + b + "x + "+ c + " is" +" x=" + result1);
        } else{
            System.out.println("The equation " + a + "x^2 + " + b + "x + "+ c + " has no real solutions");
        }
        s.close();
    }
}
// javac Unit03\Xtras\QuadraticSolver.java
// java Unit03.Xtras.QuadraticSolver