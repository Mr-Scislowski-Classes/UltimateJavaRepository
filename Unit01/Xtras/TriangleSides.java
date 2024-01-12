package Unit01.Xtras;

public class TriangleSides {
    public static void main(String[] args) {
        int a = Integer.parseInt(args [0]);
        int b = Integer.parseInt(args [1]);
        int c = Integer.parseInt(args [2]);
        if ((a + b < c) || (a + c < b) || (b + c < a) ){
            System.out.println("false");
        } else{
            System.out.println("true");
        }
    }
}
