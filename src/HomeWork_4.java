import java.util.Random;
import java.util.Scanner;

/**
 * Java 1
 *@author Pavel Kirilenko
 *@version 29.04.2022
 */

public class HomeWork_4 {
    final char SIGN_X = 'x';
    final char SIGN_0 = '0';
    final char SIGN_EMPTY = '.';
    char [][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new HomeWork_4().game();
    }

    HomeWork_4() {
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    void game() {
        initTable();
        while (true){
            printTable();
            turnHuman();
            if(isWin(SIGN_X)) {
                System.out.println("YO WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORY DRAW....");
                break;
            }
            turnAI(SIGN_0, SIGN_X);
            if (isWin(SIGN_0)) {
                System.out.println("AI WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORY DRAW....");
                break;
            }
        }
        printTable();
        System.out.println("GAME OVER");
    }

    void initTable() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                table [i][j] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter [1...3] X Y: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table [y][x] = SIGN_X;
    }

    void turnAI(char ch, char enemyDot) {
        int x, y;
        for(x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                if (isCellValid(x, y)) {
                    table[y][x] = enemyDot;
                    if (isWin(enemyDot)) {
                        table[y][x] = ch;
                        return;
                    }
                    table[y][x] = SIGN_EMPTY;
                }
            }
        }
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table [y][x] = SIGN_0;
    }

    boolean isCellValid(int x, int y) {
        if(x < 0 || x >= 3 || y < 0 || y >= 3) {
            return false;
        }
        return table [y][x] == SIGN_EMPTY;
    }

    boolean isWin(char ch) {
        for(int i = 0; i < 3; i++) {
            if ((table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) || (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch)) {
                return true;
            }
        }
        if((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) || (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch)) {
            return true;
        }
        return false;
    }

    boolean isTableFull () {
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}
