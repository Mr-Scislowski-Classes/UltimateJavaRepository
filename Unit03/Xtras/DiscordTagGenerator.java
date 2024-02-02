package Unit03.Xtras;

import java.util.Scanner;

public class DiscordTagGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        name += "#";
        for (int i = 0; i < 4; i++) {
            name += (int) (Math.random() * 11);
        }
        System.out.println(name);

        scanner.close();
    }
}
// javac Unit03\Xtras\DiscordTagGenerator.java
// java Unit03.Xtras.DiscordTagGenerator