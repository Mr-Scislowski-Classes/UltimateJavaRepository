package Unit02.Xtras;

public class ScannerDemo {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Welcome to calculator app");

        System.out.print("Enter first number: ");
        double n1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = scan.nextDouble();

        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));

        scan.close();

    }
}
// Running the program interactively
// javac Unit02/Xtras/ScannerDemo.java 
// java Unit02.Xtras.ScannerDemo

// Running the program with piped input from command line
// echo "Mr Scislowski\n5\n3" | java Unit02.Xtras.ScannerDemo

// Running the program with piped input from a file
// cat Unit02/Xtras/example.txt | java Unit02.Xtras.ScannerDemo
