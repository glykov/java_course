import java.time.LocalDate;
import java.util.Scanner;

public class Homework11 {
    // task 1
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    // task 2
    public static void chooseVersion(int os, int year) {
        if (year < LocalDate.now().getYear()) {
            if (os == 0) {
                System.out.println("Установите облегченную версию для iOS");
            } else {
                System.out.println("Установите облегченную версию для Android");
            }
        } else {
            if (os == 0) {
                System.out.println("Установите обычную версию для iOS");
            } else {
                System.out.println("Установите обычную версию для Android");
            }
        }
    }

    // task 3
    public static int deliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        }
        if (distance > 20 && distance <= 60) {
            return 2;
        }
        if (distance > 60 && distance <= 100) {
            return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        // task 1 test
        int year;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите значение года: ");
        year = scanner.nextInt();
        
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }

        // task 2 test
        chooseVersion(1, 2021);

        // task 3 test
        System.out.print("Введите дистанцию в километрах: ");
        int distance = in.nextInt();
        int daysNeeded = deliveryDays(distance);
        if (daysNeeded == -1) {
            System.out.println("В Ваш регион доставки нет");
        } else {
            System.out.println("Доставка займет " + daysNeeded + " дней");
        }
    }
}
