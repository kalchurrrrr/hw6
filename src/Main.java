public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int a = 0; a < 17; a = a + 2) {
            System.out.println(a);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int a = 10; a >= -10; a = a - 1) {
            System.out.println(a);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int b = 7; b <= 98; b = b + 7) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        int number = 1;
        System.out.print(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int pay = 29000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += pay;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int pay = 29000;
        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumWithPercent = (sumWithPercent + pay) * (1 + percent);
            System.out.println("Месяц " + i + " сумма накоплений равна " + sumWithPercent + " рублей");
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        int n = 2;
        for (int a = 1; a <= 10; a++) {
            System.out.println(n + "*" + a + "=" + n * a);
        }
    }
}