public class Homework10 {
    public static void main(String[] args) {
        // task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // task 2
        String reportName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + reportName);

        // task 3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}
