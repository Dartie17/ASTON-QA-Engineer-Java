import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Задание 1:");
        printThreeWords();
        System.out.println();

        System.out.println("Задание 2:");
        checkSumSign();
        System.out.println();

        System.out.println("Задание 3:");
        printColor();
        System.out.println();

        System.out.println("Задание 4:");
        compareNumbers();
        System.out.println();

        System.out.println("Задание 5:");
        System.out.println(isFrom10To20());
        System.out.println();

        System.out.println("Задание 6:");
        System.out.print("Введите целое число: ");
        int num6 = scan.nextInt();
        positiveOrNegative(num6);
        System.out.println();

        System.out.println("Задание 7:");
        System.out.print("Введите целое число: ");
        int num7 = scan.nextInt();
        System.out.println(isNegative(num7));
        System.out.println();

        System.out.println("Задание 8:");
        System.out.print("Введите строку: ");
        String str8 = scan.next();
        System.out.print("Введите целое число: ");
        int num8 = scan.nextInt();
        repeatString(str8, num8);
        System.out.println();

        System.out.println("Задание 9:");
        System.out.print("Введите год: ");
        int num9 = scan.nextInt();
        System.out.println(isLeapYear(num9));
        System.out.println();

        System.out.println("Задание 10:");
        arrayChange();
        System.out.println();

        System.out.println("Задание 11:");
        arrayFill();
        System.out.println();

        System.out.println("Задание 12:");
        lessSixMultiplyTwo();
        System.out.println();

        System.out.println("Задание 13:");
        matrix();
        System.out.println();

        System.out.println("Задание 14:");
        System.out.print("Укажите длину массива: ");
        int num141 = scan.nextInt();
        System.out.print("Укажите числовое значение ячейки массива: ");
        int num142 = scan.nextInt();
        integerArray(num141, num142);
        System.out.println();
    }

    // Задание 1
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    // Задание 2
    public static void checkSumSign() {
        int a = 9;
        int b = -3;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Задание 3
    public static void printColor() {
        int value = 28;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Задание 4
    public static void compareNumbers() {
        int a = 5;
        int b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Задание 5
    public static boolean isFrom10To20() {
        int a = 3;
        int b = 7;
        int sum = a + b;
        return (10 <= sum && sum <= 20);
    }

    // Задание 6
    public static void positiveOrNegative(int num) {
        if (num >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    // Задание 7
    public static boolean isNegative(int num) {
        return (num < 0);
    }

    // Задание 8
    public static void repeatString(String text, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(text);
        }
    }

    // Задание 9
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    // Задание 10
    public static void arrayChange() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Задание 11
    public static void arrayFill() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Задание 12
    public static void lessSixMultiplyTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Задание 13
    public static void matrix() {
        int[][] arr = new int[5][5];
        int a = arr[0].length;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j || j == a - i - 1) {
                    arr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    // Задание 14
    public static void integerArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}