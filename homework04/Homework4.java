public class Homework4 {
    public static void main(String[] args) {
        // task 1
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age
                    + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age
                    + " то он не достиг совершеннолетия, нужно немного подождать");
        }

        // task 2
        int temperature = 7;
        String needCap = "нужно надеть шапку";
        String dontNeedCap = "можно идти без шапки";
        if (temperature <= 5) {
            System.out.printf("На улице %d градусов, %s", temperature, needCap);
        } else {
            System.out.printf("На улице %d градусов, %s", temperature, dontNeedCap);
        }

        // task 3
        double speed = 59.5;
        System.out.print("Если скорость " + speed + ", то ");
        if (speed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }

        // task 4
        System.out.print("Если возраст человека равен " + age + ", то ему нужно ходить ");
        if (age >= 2 && age <= 6) {
            System.out.println("в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("в школу.");
        } else if (age >= 19 && age <= 24) {
            System.out.println("в университет.");
        } else if (age > 24) {
            System.out.println("на работу.");
        }

        // task 5
        System.out.print("Если возраст ребенка равен " + age + ", то ему ");
        if (age < 5) {
            System.out.println("нельзя кататься на аттракционе");
        } else if (age >= 5 && age <= 14) {
            System.out.println("можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        }

        // task 6
        int totalCapacity = 102;
        int sittingPlaces = 60;
        int actualPassengers = 65;

        if (actualPassengers >= totalCapacity) {
            System.out.println("Мест в вагоне нет");
        } else if (actualPassengers > sittingPlaces) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне есть сидячие места");
        }

        // task 7
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Превое число самое большое");
        } else if (two > one && two > three) {
            System.out.println("Второе число самое большое");
        } else {
            System.out.println("Третье число самое большое");
        }
    }
}
