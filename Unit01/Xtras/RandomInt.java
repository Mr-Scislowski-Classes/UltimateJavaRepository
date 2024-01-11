package Unit01.Xtras;

public class RandomInt {
    public static void main(String[] args) {
        int lo = Integer.parseInt(args[0]);
        int hi = Integer.parseInt(args[1]);
        System.out.println((int) (Math.random() * (hi - lo + 1)) + lo);
    }
}
