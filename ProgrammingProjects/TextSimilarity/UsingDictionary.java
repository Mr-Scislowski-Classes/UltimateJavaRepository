package ProgrammingProjects.TextSimilarity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
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
        return words.toArray(new String[0]);
    }

    public static int fuzzyScore(String w1, String w2) {
        FuzzyScore fuzz = new FuzzyScore(Locale.getDefault());
        return fuzz.fuzzyScore(w1, w2);
    }

    public static int levenshteinDistance(String w1, String w2) {
        return new LevenshteinDetailedDistance().apply(w1, w2).getDistance();

    }

    public static String[] getTopFuzzyMatches(String[] dictionary, String target, int num) {
        String[] winners = new String[num];
        for (int i = 0; i < winners.length; i++) {
            winners[i] = dictionary[0];
        }

        for (String curWord : dictionary) {
            for (int winnerIdx = 0; winnerIdx < winners.length; winnerIdx++) {
                if (fuzzyScore(curWord, target) > fuzzyScore(winners[winnerIdx], target)) {
                    for (int j = winnerIdx; j < winners.length - 1; j++) {
                        winners[j + 1] = winners[j];
                    }
                    winners[winnerIdx] = curWord;
                    break;
                }
            }
        }

        return winners;
    }

    public static String[] getTopLevenshteinMatches(String[] dictionary, String target, int num) {
        String[] winners = new String[num];
        for (int i = 0; i < winners.length; i++) {
            winners[i] = dictionary[0];
        }

        for (String curWord : dictionary) {
            for (int winnerIdx = 0; winnerIdx < winners.length; winnerIdx++) {
                if (levenshteinDistance(curWord, target) < levenshteinDistance(winners[winnerIdx], target)) {
                    for (int j = winnerIdx; j < winners.length - 1; j++) {
                        winners[j + 1] = winners[j];
                    }
                    winners[winnerIdx] = curWord;
                    break;
                }
            }
        }

        return winners;
    }

    public static void main(String[] args) {
        String[] words = getEnglishWords();

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your word");
        String targetWord = s.nextLine();
        s.close();

        // int bestFuzzyScore = -1;
        // String fuzzyWinner = "";
        // int bestDistance = Integer.MAX_VALUE;
        // String levenshteinWinner = "";

        // FuzzyScore fuzz = new FuzzyScore(Locale.getDefault());
        // LevenshteinDetailedDistance levenshtein = new LevenshteinDetailedDistance();

        // for (String currentWord : words) {
        // if (!currentWord.equals(targetWord)) {
        // if (fuzz.fuzzyScore(targetWord, currentWord) > bestFuzzyScore) {
        // fuzzyWinner = currentWord;
        // bestFuzzyScore = fuzz.fuzzyScore(targetWord, currentWord);
        // }

        // if (levenshtein.apply(targetWord, currentWord).getDistance() < bestDistance)
        // {
        // levenshteinWinner = currentWord;
        // bestDistance = levenshtein.apply(targetWord, currentWord).getDistance();
        // }
        // }
        // }

        // System.out.println("Closest word using fuzzy algorithm was: " + fuzzyWinner);
        // System.out.println("Closest word using Levenshtein algorithm was: " +
        // levenshteinWinner);

        System.out.println(Arrays.toString(getTopFuzzyMatches(words, targetWord, 3)));
        System.out.println(Arrays.toString(getTopLevenshteinMatches(words, targetWord, 3)));

    }
}
