package Unit03.Xtras;
import java.util.Scanner;
public class BasicTextAnalysis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
            System.out.println("Enter your text: ");

            s.useDelimiter("\\Z");
            String text = s.next();
            System.out.println("text entry stopped");
            System.out.println("Your text is " + text.length() + " characters long");
            System.out.println("The first word is " + text.substring(0, text.indexOf(" ")));
            System.out.println("The first sentence is " + text.substring(0, text.indexOf(".")));
            s.close();

    }
}

// Enter your text interactively
// javac Unit03/Xtras/BasicTextAnalysis.java
// java Unit03.Xtras.BasicTextAnalysis

// Use a file as input
// javac Unit03/Xtras/BasicTextAnalysis.java
// cat Unit03/Xtras/gettysburg-address.txt | java Unit03.Xtras.BasicTextAnalysis
