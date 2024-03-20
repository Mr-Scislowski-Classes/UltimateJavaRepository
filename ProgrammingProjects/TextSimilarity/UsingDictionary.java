package ProgrammingProjects.TextSimilarity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import org.apache.commons.text.similarity.FuzzyScore;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class UsingDictionary {

    public static String[] getEnglishWords() {
        ArrayList<String> words = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader("ProgrammingProjects/TextSimilarity/words.txt"))) {
            String curLine;
            while ((curLine = br.readLine()) != null) {
                words.add(curLine);
            }
        } catch (IOException e) {
            System.out.println("Exception occurred");
            System.err.println(e);
        }
        return words.toArray(new String[0]);
    }

    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.nextLine();
        scanner.close();
        int fuzzymax = -1;
        int levmax = Integer.MAX_VALUE;
        String fuzzymaxString = "";
        String levmaxString = "";
        Locale locale = Locale.getDefault();
        FuzzyScore fuzzy = new FuzzyScore(locale);
        LevenshteinDistance lev = new LevenshteinDistance();
        int fuzzyscore;
        int levscore;
        for (String dict : getEnglishWords()) {
            fuzzyscore = fuzzy.fuzzyScore(word, dict);
            levscore = lev.apply(word, dict);
            if (fuzzyscore > fuzzymax) {
                fuzzymax = fuzzyscore;
                fuzzymaxString = dict;
            }
            if (levscore < levmax) {
                levmax = levscore;
                levmaxString = dict;
            }
        }
        System.out.println(fuzzymax + "   " + fuzzymaxString);
        System.out.println(levmax + "   " + levmaxString);
    }
}
