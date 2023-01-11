public class Homework7 {
    public static void main(String[] args) {
        // task 1
        int months = 0;
        int total = 0;
        while (total < 2_459_000) {
            total += 15_000;
            months++;
        }
        System.out.println("Месяц " + months + ", сумма накоплений равна " + total + " рублей");

        // task 2;
        int j = 1;
        while (j < 11) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
        for (j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        // task 3
        int birthRate = 17;
        int mortalityRate = 8;
        int population = 12_000_000;
        int year = 0;
        while (year < 100) {
            year++;
            population = population + (birthRate * population / 1_000) - (mortalityRate * population / 1_000);
            System.out.printf("Год %d, численность населения составляет %,d\n", year, population);
        }

        // task 4
        months = 0;
        double totalDepositAmount = 12e3;
        double interestRate = 7.0 / 100.0;
        while (totalDepositAmount < 12_000_000) {
            months++;
            totalDepositAmount += totalDepositAmount * interestRate;
            System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей\n", months, totalDepositAmount);
        }

        // task 5
        months = 0;
        totalDepositAmount = 12e3;
        while (totalDepositAmount < 12_000_000) {
            months++;
            totalDepositAmount += totalDepositAmount * interestRate;
            if (months % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей\n", months, totalDepositAmount);
            }
        }

        // task 6
        months = 0;
        totalDepositAmount = 12e3;
        while (months < 9 * 12) {
            months++;
            totalDepositAmount += totalDepositAmount * interestRate;
            if (months % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %,.2f рублей\n", months, totalDepositAmount);
            }
        }

        // task 7
        int friday = 5;
        int dayOfMonth = 1;

        for (; dayOfMonth <= 31; dayOfMonth++) {
            if (dayOfMonth == friday) {
                System.out.println("Сегодня пятница, "+ friday + "-е число. Необходимо подготовить отчет");
                friday += 7;
            }
        }

        // task 8
        int startYear = 2023 - 200;
        int endYear = 2023 + 100;
        for (int i = startYear; i <= endYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
