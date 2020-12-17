package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static char[][] map;
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '-';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            if (checkWin(DOT_X)) {
                System.out.println("вы победили");
                break;
            }
            inTurn();
            printMap();
            if (isMapFull()) {
                System.out.println("ничья");
                break;
            }
            if (checkWin(DOT_O)) {
                System.out.println("Победил компьютер");
                break;
            }
        }

    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    static boolean checkWin (char symb) {
        int d = 0;
        int r = 0;
        for (int i = 0; i < SIZE; i++) {
            int v = 0;
            int q = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) v++;
                else if (v < DOTS_TO_WIN) v = 0;

                if (map[j][i] == symb) q++;
                else if (q < DOTS_TO_WIN) q = 0;

                if (map[i][j] == symb && i==j) d++;
                else if (d < DOTS_TO_WIN) d = 0;

                if (map[i][j] == symb && i==SIZE-1-j) r++;
                else if (r < DOTS_TO_WIN) r = 0;
            }
            if (v == SIZE - 1 || q == SIZE - 1 || d == SIZE - 1 || r == SIZE - 1)
                return true;
        }
        return false;
    }

    static void initMap () {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap () {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void humanTurn () {
        int x,y;
        do {
            System.out.println("Введите координаты");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x,y));
        map[x][y] = DOT_X;
    }

    static void inTurn () {
        int x,y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x,y));
        map[x][y] = DOT_O;
    }

    static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE ) return false;
        return map[x][y] == DOT_EMPTY;
    }
}
