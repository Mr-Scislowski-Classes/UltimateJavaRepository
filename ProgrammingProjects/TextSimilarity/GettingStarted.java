package ProgrammingProjects.TextSimilarity;

import java.util.Locale;
import java.util.Scanner;

import org.apache.commons.text.similarity.FuzzyScore;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class GettingStarted {
    public static void main(String[] args) {
        // to create a new FuzzyScore object you need to pass in a Locale object.
        // You can get a Locale object with
        // Locale.getDefault()
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String first = scanner.nextLine();
        System.out.println("Enter a second word");
        String second = scanner.nextLine();
        scanner.close();
        Locale locale = Locale.getDefault();
        FuzzyScore fuzzy = new FuzzyScore(locale);
        System.out.println("The fuzzy score between \""+first+"\" and \""+second+"\" is "+fuzzy.fuzzyScore(first, second)+".");
        LevenshteinDistance lev = new LevenshteinDistance();
        System.out.println("The Levenshtein distance between \""+first+"\" and \""+second+"\" is "+lev.apply(first, second)+".");
    }
}
