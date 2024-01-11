package Unit01.Xtras;

public class TrigIdentity {
    public static void main(String[] args) {
        double angle = Double.parseDouble(args[0]);
        System.out.print(Math.pow(Math.cos(angle), 2) + Math.pow(Math.sin(angle), 2));
        
    }
}
