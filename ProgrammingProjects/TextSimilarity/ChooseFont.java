package ProgrammingProjects.TextSimilarity;

import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.text.similarity.LevenshteinDistance;


public class ChooseFont {
    static LevenshteinDistance lev = new LevenshteinDistance();
    
    public static boolean check(ArrayList<String> fonts, String word) {
        int prev = -1;
        int curr;
        for (String font : fonts) {
            curr = lev.apply(font, word);
            if (curr >= prev) {
                prev = curr;
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<String> fonts = new ArrayList<>();
        fonts.addAll(Arrays.asList(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames()));
        for(String font : fonts) {
            System.out.println(font);
        }
        System.out.println("-----   Choose a font   -----");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("-----   Did you mean   -----");
        scanner.close();
        int firstIndex;
        int secondIndex;
        String temp;
        while (!check(fonts, word)) {
            firstIndex = (int) (Math.random() * 225);
            secondIndex = (int) (firstIndex + 1 + Math.random() * (225 - firstIndex));
            if (lev.apply(fonts.get(firstIndex), word) > lev.apply(fonts.get(secondIndex), word)) {
                temp = fonts.get(firstIndex);
                fonts.set(firstIndex, fonts.get(secondIndex));
                fonts.set(secondIndex, temp);
            }
        }
        for(int i = 0; i < 3; i++) {
            System.out.println(fonts.get(i));
        }
    }
}