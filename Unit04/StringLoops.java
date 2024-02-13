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
        String returned = "";
        for (int i = 0; i < str.length(); i++) {
            returned += str.substring(i, i+1);
            returned += str.substring(i, i+1);
        }
        return returned;
    }

    public static int countCode(String str) {
        int returned = 0;
        for (int i = 0; i < str.length()-3; i++) {
            if (str.substring(i, i+1).equals("c") && str.substring(i+1, i+2).equals("o") && str.substring(i+3, i+4).equals("e")) {
                returned += 1;
            }
        }
        return returned;
    }

    public static boolean bobThere(String str) {
        boolean returned = false;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i+1).equals("b") && str.substring(i+2, i+3).equals("b")) {
                returned = true;
                break;
            }
        }
        return returned;
    }

    public static boolean prefixAgain(String str, int n) {
        boolean returned = false;
        String prefix = str.substring(0, n);
        for (int i = n; i < str.length()-n+1; i++) {
            if (str.substring(i, i+n).equals(prefix)) {
                returned = true;
                break;
            }
        }
        return returned;
    }

    public static boolean sameStarChar(String str) {
        boolean returned = true;
        for (int i = 1; i < str.length()-1; i++) {
            if (str.substring(i, i+1).equals("*") && !str.substring(i-1, i).equals(str.substring(i+1, i+2))) {
                returned = false;
            } 
        }
        return returned;
    }

    public static String starOut(String str) {
        String returned = "";
        for (int i = 0; i < str.length(); i++) {
            if (!str.substring(i, i+1).equals("*")) {
                if (str.length() != 1) {
                    if (i == 0) {
                        if (!str.substring(i+1, i+2).equals("*")) {
                            returned += str.substring(i, i+1);
                        }
                    } else if (i == str.length()-1) {
                        if (!str.substring(i-1, i).equals("*")) {
                            returned += str.substring(i, i+1);
                        }
                    } else {
                        if (!str.substring(i+1, i+2).equals("*") && !str.substring(i-1, i).equals("*")) {
                            returned += str.substring(i, i+1);
                        }
                    }
                } else {
                    returned += str.substring(i, i+1);
                }
            }
        }
        return returned;
    }

    public static int countHi(String str) {
        int returned = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+1).equals("h") && str.substring(i+1, i+2).equals("i")) {
                returned += 1;
            }
        }
        return returned;
    }

    public static boolean endOther(String a, String b) {
        boolean returned = false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() > b.length()) {
            if (a.substring(a.length()-b.length()).equals(b)) {
                returned = true;
            }
        } else {
            if (b.substring(b.length()-a.length()).equals(a)) {
                returned = true;
            }
        }
        return returned;
    }

    public static boolean xyBalance(String str) {
        boolean returned = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+1).equals("x")) {
                returned = true;
            } else if (str.substring(i, i+1).equals("y")) {
                returned = false;
            }
        }
        
        return !returned;
    }

    public static String plusOut(String str, String word) {
        String returned = "";
        for (int i = 0; i < str.length()-word.length()+1; i++) {
            System.out.println("currently looking at index: " + i);
            System.out.println("will stop at index: " + (str.length()-word.length()+1) );
            if (!str.substring(i, i + word.length()).equals(word)) {
                returned += "+";
            } else {
                returned += word;
                i += word.length()-1;
            }
        }

        while (returned.length() < str.length()) {
            returned += "+";
        }
        return returned;
    }

    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i+1).equals("c") && str.substring(i+1, i+2).equals("a") && str.substring(i+2, i+3).equals("t")) {
                cat += 1;
            } else if (str.substring(i, i+1).equals("d") && str.substring(i+1, i+2).equals("o") && str.substring(i+2, i+3).equals("g")) {
                dog += 1;
            }
        }
        return cat == dog;
    }

    public static String mixString(String a, String b) {
        String returned = "";
        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            if (i < a.length()) {
                returned += a.substring(i, i+1);
            }
            if (i < b.length()) {
                returned += b.substring(i, i+1);
            }
        }
        return returned;
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String returned = "";
        for (int i = 0; i < count; i++) {
            if (i != count-1) {
                returned += word + sep;
            } else {
                returned += word;
            }
        }
        return returned;
    }
}
