import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str = "HeLlO wOrLd!";
        swapCase(str);
        System.out.println(str); // prints: "hElLo WoRlD!"
    }

    public static void swapCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                str = str.replaceFirst(String.valueOf(c), Character.toLowerCase(c).toString());
            } else if (Character.isLowerCase(c)) {
                str = str.replaceFirst(String.valueOf(c), Character.toUpperCase(c).toString());
            }
        }
    }
}