package ProgrammingProjects.TextSimilarity;

import java.util.Locale;

import org.apache.commons.text.similarity.FuzzyScore;
import org.apache.commons.text.similarity.LevenshteinDetailedDistance;

public class Utils {
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
}
