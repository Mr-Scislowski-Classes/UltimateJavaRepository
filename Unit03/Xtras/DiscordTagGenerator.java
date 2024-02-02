package Unit03.Xtras;
import java.util.Scanner;

public class DiscordTagGenerator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = s.nextLine();

        int a = (int)(Math.random() * (9999-1000+1)) + 1000;

        String id = Integer.toString(a);

        System.out.println(name + "#" + id);
        s.close();
    }
}
// javac Unit03\Xtras\DiscordTagGenerator.java
// java Unit03.Xtras.DiscordTagGenerator