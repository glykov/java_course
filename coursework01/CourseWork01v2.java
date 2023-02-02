import java.util.Scanner;

public class CourseWork01v2 {
    public static void main(String[] args) {
        EmployeeBook eb = new EmployeeBook();

        eb.showAllEmployees();
        
        System.out.println("Enter data to add new employee:");
        Scanner in = new Scanner(System.in);
        System.out.print("First name: ");
        String firstName = in.nextLine();
        System.out.print("Last name: ");
        String lastName = in.nextLine();
        /* another variant:
         * System.out.print("Enter full name: ");
         * String name = in.nextLine();
         * String[] tmp = name.split("\\s+");
         * and then condtracting Employee object we can use
         * new Employee(tmp[0], tmp[1], ...);
         */
        System.out.print("Enter department number (1 - 5): ");
        int deptNo = Integer.parseInt(in.nextLine());       // removing new line symbols :)
        while (deptNo < 1 || deptNo > 5) {
            System.out.print("You entered wrong department number. Try again (1 - 5): ");
            deptNo = in.nextInt();
        }
        System.out.print("Enter salary: ");
        double salary = Double.parseDouble(in.nextLine());

        eb.addEmployee(firstName, lastName, deptNo, salary);
        eb.showAllEmployees();
        System.out.println("============================================");

        System.out.print("What employee do you wnat to fire? Emter the full name: ");
        String nameToWork = in.nextLine();
        eb.removeEmployee(nameToWork);
        eb.showAllEmployees();
        System.out.println("============================================");

        System.out.print("What employee do you wnat to change salary? Emter the full name: ");
        nameToWork = in.nextLine();
        System.out.print("Enter new salary: ");
        salary = Double.parseDouble(in.nextLine());
        eb.changeSalary(nameToWork, salary);
        eb.showAllEmployees();
        System.out.println("============================================");

        System.out.print("What employee do you wnat to move in another department? Emter the full name: ");
        nameToWork = in.nextLine();
        System.out.print("Enter new department (1 - 5): ");     // hope department will be correct :) don't want to check it again
        deptNo = Integer.parseInt(in.nextLine());
        eb.changeSalary(nameToWork, deptNo);
        eb.showAllEmployees();
        System.out.println("============================================");

        in.close();

        System.out.println("Employees by department");
        eb.showEmployeesByDept();
    }
}
