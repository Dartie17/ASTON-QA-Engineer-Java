import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        from10To20();
        System.out.println();

        System.out.println("Задание 6:");
        positiveOrNegativeV1();
        System.out.println();

        System.out.println("Задание 7:");
        positiveOrNegativeV2();
        System.out.println();

        System.out.println("Задание 8:");
        repeatString();
        System.out.println();

        System.out.println("Задание 9:");
        isLeapYear();
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
    }

    // Задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Задание 2
    public static void checkSumSign() {
        int a = 15;
        int b = 28;
        int sum = a + b;
        if (sum >= 0) {
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
    public static void from10To20() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = scan.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = scan.nextInt();
        int sum = a + b;
        boolean c = 10 <= sum && sum <= 20;
        System.out.println(c);
    }

    // Задание 6
    public static void positiveOrNegativeV1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int a = scan.nextInt();
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    // Задание 7
    public static void positiveOrNegativeV2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int a = scan.nextInt();
        boolean b = a < 0;
        System.out.println(b);
    }

    // Задание 8
    public static void repeatString() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String a = scan.next();
        System.out.print("Введите целое число: ");
        int b = scan.nextInt();
        for (int i = 1; i <= b; i++) {
            System.out.println(a);
        }
    }

    // Задание 9
    public static void isLeapYear() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год: ");
        int a = scan.nextInt();
        boolean b = (a % 4 == 0 && a % 100 != 0) || a % 400 == 0;
        System.out.println(b);
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
}