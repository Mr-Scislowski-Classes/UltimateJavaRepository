package Unit10;

public class Topic10_1Recursion {
    static int numberOfFunctionCalls = 0;

    public static int recursiveMax(int[] a, int pos) {
        numberOfFunctionCalls++;
        int myNumber = numberOfFunctionCalls;

        System.out.println("recursiveMax called with pos = " + pos);

        int curVal = a[pos];

        if (pos == a.length - 1) {
            System.out.println("Call number " + myNumber + " returning " + a[pos] + " because we're at the end of the array");
            return a[pos];
        }

        int maxOfRest = recursiveMax(a, pos + 1);


        if (curVal > maxOfRest) {
            System.out.println("call number " + myNumber + " returning "+ curVal + " because " + curVal + " > " + maxOfRest);
            return curVal;
        } else {
            System.out.println("call number " + myNumber + " returning "+ maxOfRest + " because " + curVal + " < " + maxOfRest);
            return maxOfRest;
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int choose(int n, int r) {
        return factorial(n) / (factorial(n-r) * factorial(r));

    }
    public static void main(String[] args) {
        // recursiveMax(new int[] {3, 8, 1, 2, 5}, 0);
    }
}
