package Unit04;

public class StringLoops {

    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String curLetter = str.substring(i, i + 1);
            result += curLetter + curLetter;
        }
        return result;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 4; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
                count++;
            }
        }
        return count;
    }

    public static boolean bobThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 1).equals("b") &&
                    str.substring(i + 2, i + 3).equals("b")) {
                return true;
            }
        }
        return false;
    }

    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = n; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(prefix)) {
                return true;
            }
        }
        return false;
    }

    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("*") &&
                    !str.substring(i - 1, i).equals(str.substring(i + 1, i + 2))) {
                return false;
            }
        }
        return true;
    }

    public static String starOut(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String prev = "";
            if (i > 0) {
                prev = str.substring(i - 1, i);
            }

            String next = "";
            if (i < str.length() - 1) {
                next = str.substring(i + 1, i + 2);
            }

            String cur = str.substring(i, i + 1);

            if (prev.equals("*") ||
                    cur.equals("*") ||
                    next.equals("*")) {
                // do nothing
            } else {
                result += cur;
            }
        }
        return result;
    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public static boolean endOther(String a, String b) {
        String al = a.toLowerCase();
        String bl = b.toLowerCase();

        if (al.length() > bl.length()) {
            return bl.equals(al.substring(al.length() - bl.length()));
        } else {
            return al.equals(bl.substring(bl.length() - al.length()));
        }
    }

    public static boolean xyBalance(String str) {
        boolean balanced = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("x")) {
                balanced = false;
            }
            if (str.substring(i, i + 1).equals("y")) {
                balanced = true;
            }
        }
        return balanced;
    }

    public static String plusOut(String str, String word) {
        int pos = 0;
        String result = "";

        while (pos < str.length()) {
            if (pos + word.length() <= str.length() && str.substring(pos, pos + word.length()).equals(word)) {
                result += word;
                pos += word.length();
            } else {
                result += "+";
                pos += 1;
            }
        }

        return result;
    }

    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCount++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }

    public static String mixString(String a, String b) {
        String result = "";

        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            if (i < a.length()) {
                result += a.substring(i, i + 1);
            }
            if (i < b.length()) {
                result += b.substring(i, i + 1);
            }
        }
        return result;
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String result = "";

        for (int i = 1; i <= count; i++) {
            result += word;
            if (i != count) {
                result += sep;
            }
        }

        return result;
    }
}
