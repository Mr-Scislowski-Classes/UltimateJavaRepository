package Unit01.Xtras;

public class DistanceFormula {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int x2 = Integer.parseInt(args[1]);
        int y1 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        System.out.println(Math.pow(Math.pow(Math.abs(x1-x2), 2) + Math.pow(Math.abs(y1-y2), 2), 0.5));
    }
}
