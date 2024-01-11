package Unit01.Xtras;

public class RandomStats {
    public static void main(String[] args) {
        double n1 = Math.random();
        double n2 = Math.random();
        double n3 = Math.random();
        double n4 = Math.random();
        double n5 = Math.random();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println("Minimum - " + Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, n5)))));
        System.out.println("Maximum - " + Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5)))));
        System.out.println("Average - " + ((n1 + n2 + n3 + n4 + n5)/5));
    }
}
