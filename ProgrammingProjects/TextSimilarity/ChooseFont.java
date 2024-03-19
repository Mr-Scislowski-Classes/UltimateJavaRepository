package ProgrammingProjects.TextSimilarity;

import java.awt.*;
import java.util.Arrays;

public class ChooseFont {
    public static void main(String[] args) {
        String[] allFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        System.out.println("Available fonts: ");

        for (String font : allFonts) {
            System.out.println(font);
        }

    }
}
