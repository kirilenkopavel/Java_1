/**
 * Java 1
 *@author Pavel Kirilenko
 *@version 20.04.2022
 */

public class HomeWork_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor(0);
        compareNumbers(5, 7);
    }

    static void printThreeWords() {
        String o, b, a;
        o = "Orange";
        b = "Banana";
        a = "Apple";
        System.out.println(o + "\n" + b + "\n" + a);
    }


    static void checkSumSign() {
        int a = 7;
        int b = 4;
        int c = a + b;
        System.out.println((c >= 0)? "Сумма положительная" : "Сумма отрицательная");
    }

    static void printColor(int value) {
        if(value <= 0){
            System.out.println("Red");
        }
        else
            if(value > 100) {
                System.out.println("Green");
            }
            else {
                System.out.println("Yellow");
            }
    }

    static void compareNumbers(int a, int b) {
        System.out.println((a >= b)? "a >= b" : "a < b");
    }
}