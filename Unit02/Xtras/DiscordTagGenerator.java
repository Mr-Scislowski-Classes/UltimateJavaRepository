package Unit02.Xtras;

public class DiscordTagGenerator {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Enter your desired username: ");
        String name = scan.nextLine();

        String tagNumber = "" +
                (int) (Math.random() * 10) +
                (int) (Math.random() * 10) +
                (int) (Math.random() * 10) +
                (int) (Math.random() * 10);

        System.out.println("Your Discord tag is: " + name + "#" + tagNumber);
        scan.close();
    }
}
