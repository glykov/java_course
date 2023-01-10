public class Homework6 {
    public static void main(String[] args) {
        // task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // task 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // task 3.1 - first variant
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // task 3.2 - second variant
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        // task 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // task 5
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        // task 6
        for (int i = 7; i < 100; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        // task 7
        for (int i = 1; i < 1000; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // task 8
        int monthlyPayment = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += monthlyPayment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // task 9
        monthlyPayment = 29000;
        total = 0;
        for (int i = 1; i <= 12; i++) {
            total += total / 100;
            total += monthlyPayment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // task 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}
