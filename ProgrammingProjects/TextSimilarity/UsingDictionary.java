package ProgrammingProjects.TextSimilarity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import org.apache.commons.text.similarity.FuzzyScore;
import org.apache.commons.text.similarity.LevenshteinDetailedDistance;

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
        return (String[]) words.toArray();

    }

    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("ProgrammingProjects/TextSimilarity/words.txt");
        BufferedReader br = new BufferedReader(reader);

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your word");
        String targetWord = s.nextLine();
        s.close();

        int bestFuzzyScore = -1;
        String fuzzyWinner = "";
        int bestDistance = Integer.MAX_VALUE;
        String levenshteinWinner = "";

        FuzzyScore fuzz = new FuzzyScore(Locale.getDefault());
        LevenshteinDetailedDistance levenshtein = new LevenshteinDetailedDistance();

        String currentWord = br.readLine();
        while (currentWord != null) {
            if (!currentWord.equals(targetWord)) {
                if (fuzz.fuzzyScore(targetWord, currentWord) > bestFuzzyScore) {
                    fuzzyWinner = currentWord;
                    bestFuzzyScore = fuzz.fuzzyScore(targetWord, currentWord);
                }

                if (levenshtein.apply(targetWord, currentWord).getDistance() < bestDistance) {
                    levenshteinWinner = currentWord;
                    bestDistance = levenshtein.apply(targetWord, currentWord).getDistance();
                }
            }
            currentWord = br.readLine();

        }

        reader.close();
        br.close();

        System.out.println("Closest word using fuzzy algorithm was: " + fuzzyWinner);
        System.out.println("Closest word using Levenshtein algorithm was: " + levenshteinWinner);

    }
}
