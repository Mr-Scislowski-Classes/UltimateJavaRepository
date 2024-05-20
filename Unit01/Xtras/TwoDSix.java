package Unit01.Xtras;

public class TwoDSix {
    public static void main(String[] args) {
        int firstNum = (int) (Math.random() * (6-1+1)) + 1;
        int secondNum = (int) (Math.random() * (6-1+1)) + 1;
        System.out.println(firstNum);
        System.out.println(secondNum);
        int result = firstNum + secondNum;
        System.out.println(result);
    }
}
