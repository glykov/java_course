public class Homework2 {
    public static void main(String[] args) {
        // task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 2
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 4
        var friend = 19;
        System.out.println(friend);
        friend *= 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        // task 5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        // task 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров " + totalWeight + " кг.");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе боксеров " + weightDifference + " кг.");

        // task 7
        // difference found with subtraction
        System.out.println("Разница в весе, найденная вычитанием " + weightDifference + " кг.");
        // difference found with modulo
        weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе, найденая взятием остатка " + weightDifference + " кг.");

        // task 8
        var totalWorkingHours = 640;
        var employeeWorkingHours = 8;
        var numberOfEmployees = totalWorkingHours / employeeWorkingHours;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек.");
        numberOfEmployees += 94;
        totalWorkingHours = employeeWorkingHours * numberOfEmployees;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего"
                + totalWorkingHours + " часов работы может быть пожелено между сотрудниками.");
    }
}
