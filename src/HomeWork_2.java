/**
 * Java 1
 *@author Pavel Kirilenko
 *@version 24.04.2022
 */

public class HomeWork_2 {
    public static void main(String[] args) {
        isSum10_20(6, 8);
        isPositive (5);
        isNegative(-5);
        printWord ("Hello World!", 3);
    }

    static boolean isSum10_20 (int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static void isPositive (int x) {
        System.out.println((x >= 0)? "Positive number" : "Negative number");
    }

    static boolean isNegative (int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    static void printWord (String word, int time) {
        for (int i = 0; i < time; i++) {
            System.out.println(word);
        }
    }
}
