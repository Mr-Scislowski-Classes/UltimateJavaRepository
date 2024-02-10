package Unit04;

public class StringLoops {

    public static boolean xyzThere(String str) {

        for (int i = 0; i <= str.length() - 3; i++) {
            // found an "xyz"
            if (str.substring(i, i + 3).equals("xyz")) {
                // if it's a ".xyz"
                if (i > 0 && str.substring(i - 1, i).equals(".")) {
                    // do nothing
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static String zipZap(String str) {
        String result = "";

        for (int i = 0; i <= str.length() - 3; i++) {
            // if I find zip, zap, zsp, etc
            if (str.substring(i, i + 1).equals("z") &&
                    str.substring(i + 2, i + 3).equals("p")) {
                result += "zp";
                i += 2;
            } else {
                result += str.substring(i, i + 1);
            }
        }

        if (str.length() < 3) {
            result += str;
        } else if (str.substring(str.length() - 3, str.length() - 2).equals("z") &&
                str.substring(str.length() - 1).equals("p")) {
            // do nothing
        } else {
            result += str.substring(str.length() - 2);
        }

        return result;
    }

    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++){
            result += str.substring(i,i+1);
            result += str.substring(i,i+1);
        }
        return result;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i=0; i< str.length()-3; i++){
            if (str.substring(i, i +2).equals("co") && str.substring(i+3, i+4).equals("e")){
                count++;
            }
        }
        return count;
    }

    public static boolean bobThere(String str) {
        for (int i=0; i< str.length()-2; i++){
            if (str.substring(i, i +1).equals("b") && str.substring(i+2, i+3).equals("b")){
                return true;
            }
        }
        return false;
    }

    public static boolean prefixAgain(String str, int n) {
        for (int i=n; i < str.length()-n+1; i++){
            if (str.substring(i, i + n).equals(str.substring(0,n)))
                return true;
            }
        return false;
    }

    public static boolean sameStarChar(String str) {

        for (int i=1; i< str.length()-1; i++){
            if(str.substring(i,i+1).equals("*") && !str.substring(i-1,i).equals(str.substring(i+1,i+2)))
            return false;
        }
        return true;
    }

    public static String starOut(String str) {
        String result = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.substring(i,i+1).equals("*"))
            count++;
        }
        if (count == 1){
            for(int i=0; i <str.length();i++){
                if (str.substring(i,i+1).equals("*")){
                result = str.substring(0,i-1) + str.substring(i+1,str.length());
            }
            }
        } else {
            
        return ""; 

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length()); i++){
            if (str.substring(0,i+2).equals("hi")){
            count++;
            }
        }
        return count;
    }

    public static boolean endOther(String a, String b) {
        return false;
    }

    public static boolean xyBalance(String str) {
        return false;
    }

    public static String plusOut(String str, String word) {
        return "";
    }

    public static boolean catDog(String str) {
        return false;
    }

    public static String mixString(String a, String b) {
        return "";
    }

    public static String repeatSeparator(String word, String sep, int count) {
        return "";
    }
}
