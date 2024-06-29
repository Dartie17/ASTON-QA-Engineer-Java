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
}