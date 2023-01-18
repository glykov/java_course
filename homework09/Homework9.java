import java.util.*;

public class Homework9 {
    public static int[] generateRandomArray() {
        Random rand = new Random();
        int[] arr = new int[30];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100_000) + 100_000;
        }
        
        return arr;
    }

    // task 1
    public static void taskOne() {
        int[] arr = generateRandomArray();
        int sum = 0;
        
        for (int element : arr) {
            sum += element;
        }
        
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    // task 2
    public static void taskTwo() {
        int[] arr = generateRandomArray();
        int minValue = arr[0];
        int maxValue = arr[0];
        
        for (int element : arr) {
            if (element < minValue) {
                minValue = element;
            }
            if (element > maxValue) {
                maxValue = element;
            }
        }

        System.out.print("Минимальная сумма трат за день составила " + minValue + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxValue + " рублей».");
    }

    // task 3
    public static void taskThree() {
        int[] arr = generateRandomArray();
        int sum = 0;
        
        for (int element : arr) {
            sum += element;
        }
        double average = 1.0 * sum / arr.length;    
        // или double average = (double)sum / arr.length;  // тоже сработает, т.к. приоритет приведения типо выше чем деления
        
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    // task 4
    public static void taskFour() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
    }
}
