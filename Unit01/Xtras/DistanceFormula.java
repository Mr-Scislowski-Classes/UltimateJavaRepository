package Unit01.Xtras;

public class DistanceFormula {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        double changeInX= (double)(Math.pow(x1 - x2, 2));
        double changeInY= (double)(Math.pow(y1 - y2, 2));
        double result = Math.sqrt(changeInX+changeInY);
        System.out.println(result);
    }
}
