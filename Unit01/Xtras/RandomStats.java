package Unit01.Xtras;

public class RandomStats {
    public static void main(String[] args) {
        double firstNum = (double) (Math.random());
        System.out.println(firstNum);
         double secondNum = (double) (Math.random());
        System.out.println(secondNum);
         double thirdNum = (double) (Math.random());
        System.out.println(thirdNum);
         double fourthNum = (double) (Math.random());
        System.out.println(fourthNum);
         double fifthNum = (double) (Math.random());
        System.out.println(fifthNum);
        // Math.min(Math.min(Math.min(a, b), c), d)
        // System.out.println("Min: " + Math.min(firstNum, secondNum, thirdNum, fourthNum, fifthNum));
        // System.out.println("Max: " + Math.max(firstNum, secondNum, thirdNum, fourthNum, fifthNum));
        System.out.println("Average: " + (firstNum + secondNum + thirdNum + fourthNum + fifthNum)/5);
    }
}
