package ProgrammingProjects.TextSimilarity;

import java.util.Locale;
import java.util.Scanner;

import org.apache.commons.text.similarity.FuzzyScore;
import org.apache.commons.text.similarity.LevenshteinDetailedDistance;

public class GettingStarted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first word: ");
        String first = scanner.nextLine();
        System.out.println("Please enter your second word: ");
        String second = scanner.nextLine();

        FuzzyScore f1 = new FuzzyScore(Locale.getDefault());

        System.out.println(
                "The Fuzzy Score between '" + first + "' and '" + second + "' is: " + f1.fuzzyScore(first, second));

        LevenshteinDetailedDistance l1 = new LevenshteinDetailedDistance();
        System.out.println("The Levenshtein Distance between '" + first + "' and '" + second + "' is: "
                + l1.apply(first, second).getDistance());

        scanner.close();
    }
}
