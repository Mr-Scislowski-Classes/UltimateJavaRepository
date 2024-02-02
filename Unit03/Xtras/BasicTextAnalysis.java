package Unit03.Xtras;
import java.util.Scanner;

public class BasicTextAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\Z");
        String text = scanner.next();
        System.out.println("Length - " + text.length());
        System.out.print("First word - ");
        try {
            System.out.println(text.substring(0, text.indexOf(" ")));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(text);
        }

        System.out.print("First sentence - ");
        try {
            System.out.println(text.substring(0, text.indexOf(".")));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(text);
        }
        scanner.close();
    }
}

// Enter your text interactively
// javac Unit03/Xtras/BasicTextAnalysis.java
// java Unit03.Xtras.BasicTextAnalysis

// Use a file as input
// javac Unit03/Xtras/BasicTextAnalysis.java
// cat Unit03/Xtras/gettysburg-address.txt | java Unit02.Xtras.BasicTextAnalysis
