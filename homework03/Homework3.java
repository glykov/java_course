public class Homework3 {
    public static void main(String[] args) {
        // task 01
        byte bVar = 127;
        short shVar = 32000;
        int iVar = 5;
        long lVar = 5_000_000_000_000L;
        float fVar = 5.5f;
        double dVar = 0.123456789;
        System.out.println("Значение переменной bVar с типом byte равно " + bVar);
        System.out.println("Значение переменной shVar с типом short равно " + shVar);
        System.out.println("Значение переменной iVar с типом int равно " + iVar);
        System.out.println("Значение переменной lVar с типом long равно " + lVar);
        System.out.println("Значение переменной fVar с типом float равно " + fVar);
        System.out.println("Значение переменной dVar с типом double равно " + dVar);
        System.out.println("======================================================");

        // task 02
        float first = 27.12f;
        long second = 987_678_965_549L;
        double third = 2.786;
        short fourth = 596;
        short fifth = -159;
        int sixth = 27897;      // в short тоже поместиться
        byte seventh = 67;

        // task 03
        int firstClassStudents = 23;
        int secondClassStudents = 27;
        int thirdClassStudents = 30;
        int totalStudents = firstClassStudents + secondClassStudents + thirdClassStudents;
        int totalPaper = 480;
        int paperPerStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
        System.out.println("======================================================");

        // task 04
        int bottlesPerPeriod = 16;
        int basicPeriod = 2;

        int periodOne = 20;
        int periodTwo = 60 * 24;            // minutes in 24 hours
        int periodThree = periodTwo * 3;    // minutes in 3 days
        int periodFour = periodThree * 10;  // minutes in month assuming month has 30 days

        System.out.println("За 20 минут машина произвела "
                + (bottlesPerPeriod * (periodOne / basicPeriod)) + " штук бутылок");
        System.out.println("За сутки машина произвела "
                + (bottlesPerPeriod * (periodTwo / basicPeriod)) + " штук бутылок");
        System.out.println("За 3 дня машина произвела "
                + (bottlesPerPeriod * (periodThree / basicPeriod)) + " штук бутылок");
        System.out.println("За месяц машина произвела "
                + (bottlesPerPeriod * (periodFour / basicPeriod)) + " штук бутылок");
        System.out.println("======================================================");

        // task 05
        int totalPaintCans = 120;
        int whitePaintCansPerClass = 2;
        int brownPaintCansPerClass = 4;
        int numberOfClasses = totalPaintCans / (whitePaintCansPerClass + brownPaintCansPerClass);
        int totalWhitePaintCans = numberOfClasses * whitePaintCansPerClass;
        int totalBrownPaintCans = numberOfClasses * brownPaintCansPerClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно "
                + totalWhitePaintCans + " банок белой краски и "
                + totalBrownPaintCans + " банок коричневой краски");
        System.out.println("======================================================");

        // task 06
        int bananasNum = 5;
        int bananaWeight = 80;
        int milkAmountMl = 200;
        int milkWeight = 105;
        int iceCreamNum = 2;
        int iceCreamWeight = 100;
        int eggsNum = 4;
        int eggWeight = 70;
        int totalWeightGr = bananaWeight * bananasNum + milkAmountMl / 100 * milkWeight
                + iceCreamNum * iceCreamWeight + eggsNum * eggWeight;
        double totalWeightKg = totalWeightGr / 1000.0;

        // task 07
        int targetWeightLoss = 7;
        int minDailyWeightLoss = 250;
        int maxDailyWeightLoss = 500;
        int maxDaysToTarget = targetWeightLoss * 1000 / minDailyWeightLoss;
        System.out.println("Достижение целевых показателей может занять " + maxDaysToTarget + " дней максимум");
        int minDaysToTarget = targetWeightLoss * 1000 / maxDailyWeightLoss;
        System.out.println("Достижение целевых показателей может занять " + minDaysToTarget + " дней минимум");
        int aveDaysToTarget = (minDaysToTarget + maxDaysToTarget) / 2;
        System.out.println("Достижение целевых показателей может занять " + aveDaysToTarget + " дней в среднем");

        // task 08
        double mashaBaseSalary = 67760.00;
        double denisBaseSalary = 83690.00;
        double christinaBaseSalary = 76230.00;

        double mashaRaisedSalary = mashaBaseSalary + mashaBaseSalary * 0.1;
        double denisRaisedSalary = denisBaseSalary + denisBaseSalary * 0.1;
        double christinaRaisedSalary = christinaBaseSalary + christinaBaseSalary * 0.1;

        System.out.println("Маша теперь получает " + mashaRaisedSalary + " рублей. Годовой доход вырос на "
                + (mashaRaisedSalary * 12 - mashaBaseSalary * 12) + " рублей");
        System.out.println("Денис теперь получает " + denisRaisedSalary + " рублей. Годовой доход вырос на "
                + (denisRaisedSalary * 12 - denisBaseSalary * 12) + " рублей");
        System.out.println("Кристина теперь получает " + christinaRaisedSalary + " рублей. Годовой доход вырос на "
                + (christinaRaisedSalary * 12 - christinaBaseSalary * 12) + " рублей");

    }
}