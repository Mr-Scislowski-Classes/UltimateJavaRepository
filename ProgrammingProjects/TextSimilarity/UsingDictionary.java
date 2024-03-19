package ProgrammingProjects.TextSimilarity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
        String[] words = getEnglishWords();

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your word");
        String targetWord = s.nextLine();
        s.close();

        System.out.println(Arrays.toString(Utils.getTopFuzzyMatches(words, targetWord, 3)));
        System.out.println(Arrays.toString(Utils.getTopLevenshteinMatches(words, targetWord, 3)));

    }
}
