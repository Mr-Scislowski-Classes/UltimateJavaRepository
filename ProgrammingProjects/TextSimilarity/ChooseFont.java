package ProgrammingProjects.TextSimilarity;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ChooseFont {
    public static void main(String[] args) {
        String[] allFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        System.out.println("Available fonts: ");

        for (String font : allFonts) {
            System.out.println(font);
        }

        System.out.println("--------------------");

        Scanner s = new Scanner(System.in);
        System.out.println("Choose a font: ");
        String userInput = s.nextLine();

        System.out.println("--------------------");

        System.out.println("Top 3 matches: ");
        for (String match : Utils.getTopFuzzyMatches(allFonts, userInput, 3)) {
            System.out.println(match);
        }

    }
}
