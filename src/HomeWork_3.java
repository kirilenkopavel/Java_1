import java.util.Arrays;

/**
 * Java 1
 *@author Pavel Kirilenko
 *@version 27.04.2022
 */

public class HomeWork_3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 0, 1, 1, 1};
        int[] arr2 = {0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(invertArray(arr1)));
        System.out.println(Arrays.toString(invertArray(arr2)));

        System.out.println(Arrays.toString(fillArray(10)));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(changeArray(arr3)));

        fillDiagonal(5);

        System.out.println(Arrays.toString(initialValue(7, 3)));

    }

    static int[] invertArray(int[] arr) {
        for (int i : arr) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        return arr;
    }

    static int[] fillArray(int value) {
        int[] arr = new int[value];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    static int[] changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    static void fillDiagonal(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = (i == j || j == (size - i - 1)) ? 1 : 0;
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    static int[] initialValue (int len, int initialValue) {
        int [] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
