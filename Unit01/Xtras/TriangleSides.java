package Unit01.Xtras;

public class TriangleSides {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        if (x >= y + z) {
            System.out.println("false");
        } else if (y >= x + z) {
            System.out.println("false");
        } else if (z >= y + x) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
