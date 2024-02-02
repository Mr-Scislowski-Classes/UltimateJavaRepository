package Unit02.Xtras;

public class BasicTextAnalysis {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Enter your text");
        scan.useDelimiter("\\Z");
        String text = scan.next();
        System.out.println("Your text is " + text.length() + " characters long.");

        int idxOfFirstSpace = text.indexOf(" ");
        String firstWord = text.substring(0, idxOfFirstSpace);
        System.out.println("The first word is: " + firstWord);

        int idxOfFirstPeriod = text.indexOf(".");
        String firstSentence = text.substring(0, idxOfFirstPeriod + 1);
        System.out.println("The first sentence is: " + firstSentence);
        scan.close();
    }
}

// Enter your text interactively
// javac Unit02/Xtras/BasicTextAnalysis.java
// java Unit02.Xtras.BasicTextAnalysis

// Use a file as input
// javac Unit02/Xtras/BasicTextAnalysis.java
// cat Unit02/Xtras/gettysburg-address.txt | java Unit02.Xtras.BasicTextAnalysis
