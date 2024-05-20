package Unit02.UnitPractice;

public class StringMethods {

    public static String helloName(String name) {
        String result = "Hello " + name + "!";
        return result;
    }

    public static String firstHalf(String str) {
       
        String result = str.substring(0, (int) str.length() /2 );
        return result;
    }

    public static boolean endsLy(String str) {
        String a = str.substring(str.length() -2, str.length());
        String b = "ly";
        boolean c = a.equals(b);
        return c;
    }

    public static String makeAbba(String a, String b) {
        String result = a + b + b + a;
        return result;
    }

    public static String withoutEnd(String str) {
        String result = str.substring(1, str.length() -1);
        return result;
    }

    public static String nTwice(String str, int n) {
        String result = str.substring(0, n) + str.substring(str.length()-n);
        return result;
    }

    public static String makeTags(String tag, String word) {
        String result = "<" + tag + ">" + word + "</" + tag + ">";
        return result;
    }

    public static String middleTwo(String str) {
        String result = str.substring(str.length() / 2 -1, str.length()/2 +1);
        return result;
    }

    public static void main(String[] args) {
        // You can test your methods for specific inputs here. For example:
        System.out.println("helloName(\"Bella\") -> " + helloName("Bella"));
    }
}
