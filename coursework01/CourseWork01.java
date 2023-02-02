import java.util.Scanner;

public class CourseWork01 {
    private static Employee[] employees = {
        new Employee("Harry", "Potter", 3, 11.0),
        new Employee("Hermoine", "Granger", 3, 55.5),
        new Employee("Ron", "Weasley", 3, 9.75),
        new Employee("Albus", "Dumbledore", 1, 100500.0),
        new Employee("Rubeus", "Hagrid", 2, 5.0),
        new Employee("Severus", "Snape", 2, 500.0),
        new Employee("Drako", "Malfoy", 4, 499.0),
        new Employee("Luna", "Lovegood", 5, 3.21),
        new Employee("Minerva", "Mcgonagall", 2, 750.0),
        new Employee("Remus", "Lupin", 2, 450.0)
    };

    // 1. Получить список всех сотрудников
    public static void showAllEmployees() {
        for (var e : employees) {
            System.out.println(e);
        }
    }

    // 2. Посчитать сумму затрат на зарплаты.
    public static double calculateFullPayments() {
        double result = 0;
        for (var e : employees) {
            result += e.getSalary();
        }
        return result;
    }

    // 3. Найти сотрудника с минимальной заплатой
    public static Employee getMinPaidEmployee() {
        Employee minPaid = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (minPaid.getSalary() > employees[i].getSalary()) {
                minPaid = employees[i];
            }
        } 
        return minPaid;
    }

    // 4. Найти сотрудника с максимальной зарплатой.
    public static Employee getMaxPaidEmployee() {
        Employee maxPaid = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (maxPaid.getSalary() < employees[i].getSalary()) {
                maxPaid = employees[i];
            }
        } 
        return maxPaid;
    }

    // 5. Подсчитать среднее значение зарплат.
    public static double getAverageSalary() {
        return calculateFullPayments() / employees.length;
    }

    // 6. Show the names of all employees
    public static void showFullNames() {
        for (var e : employees) {
            System.out.println(e.getFullName());
        }
    }

    // 7. Indexing salaries by arbitrary %
    public static void indexSalaries(int percent) {
        for (var e : employees) {
            double salary = e.getSalary();
            salary += salary * percent / 100.0;
            e.setSalary(salary);
        }
    }

    // 8.1 Find minimal salary by dept
    public static Employee findMinPaidByDep(int deptNumber) {
        boolean baseFound = false;
        Employee employee = null;
        for (var e : employees) {
            if (e.getDepartment() == deptNumber) {
                if (!baseFound) {
                    employee = e;
                    baseFound = true;
                } else {
                    if (employee.getSalary() > e.getSalary()) {
                        employee = e;
                    }
                }
            }
        }
        return employee;
    }

    // 8.2 Find maximal salary by dept
    public static Employee findMaxPaidByDep(int deptNumber) {
        boolean baseFound = false;
        Employee employee = null;
        for (var e : employees) {
            if (e.getDepartment() == deptNumber) {
                if (!baseFound) {
                    employee = e;
                    baseFound = true;
                } else {
                    if (employee.getSalary() < e.getSalary()) {
                        employee = e;
                    }
                }
            }
        }
        return employee;
    }

    // 8.3 Total salary by dept
    public static double findTotalSalaryByDep(int deptNumber) {
        double total = 0.0;
        for (var e : employees) {
            if (e.getDepartment() == deptNumber) {
                total += e.getSalary();
            }
        }
        return total;
    }

    // 8.4 Average salary by dept
    public static double findAverageSalaryByDep(int deptNumber) {
        double total = 0.0;
        int count = 0;
        for (var e : employees) {
            if (e.getDepartment() == deptNumber) {
                total += e.getSalary();
                count++;
            }
        }
        return total / count;
    }

    // 8.5 Indexing salary in department
    public static void indexSalaryByDept(int deptNumber, int percent) {
        for (var e : employees) {
            if (e.getDepartment() == deptNumber) {
                double salary = e.getSalary();
                salary += salary * percent / 100.0;
                e.setSalary(salary);
            }
        }
    }

    // 8.6. Print the employees by dept
    public static void showEmployeesByDept(int deptNumber) {
        for (var e : employees) {
            if (e.getDepartment() == deptNumber) {
                System.out.println("id: " + e.getId() + ", name: " + e.getFullName() 
                + ", salary: " + e.getSalary());
            }
        }
    }

    // 9.1. find employees with salary below the amount
    public static void showEmployeesWithLowerSalary(double amount) {
        for (var e : employees) {
            if (e.getSalary() < amount) {
                System.out.println("id: " + e.getId() + ", name: " + e.getFullName() 
                + ", salary: " + e.getSalary());
            }
        }
    }

    // 9.1. find employees with salary above the amount
    public static void showEmployeesWithHigherSalary(double amount) {
        for (var e : employees) {
            if (e.getSalary() >= amount) {
                System.out.println("id: " + e.getId() + ", name: " + e.getFullName() 
                + ", salary: " + e.getSalary());
            }
        }
    }

    public static void main(String[] args) {
        showAllEmployees();
        System.out.println("============================================================");
        
        System.out.printf("The total amount of all salaries is %.2f\n", calculateFullPayments());
        System.out.println("============================================================");
        
        System.out.println("The employee with miniamal salary is:");
        System.out.println(getMinPaidEmployee());
        System.out.println("============================================================");
        
        System.out.println("The employee with maximal salary is:");
        System.out.println(getMaxPaidEmployee());
        System.out.println("============================================================");
        
        System.out.printf("The average salary is %.2f\n", getAverageSalary());
        System.out.println("============================================================");
        
        showFullNames();
        System.out.println("============================================================");
        
        indexSalaries(10);
        System.out.println("After indexing salaries:");
        showAllEmployees();
        System.out.println("============================================================");
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of department to search for minimal salary");
        int deptNumber = in.nextInt();
        System.out.println("Minimal salary in department " + deptNumber + ":");
        System.out.println(findMinPaidByDep(deptNumber));
        System.out.println("============================================================");

        System.out.println("Enter the number of department to search for maximal salary");
        deptNumber = in.nextInt();
        System.out.println("Maximal salary in department " + deptNumber + ":");
        System.out.println(findMaxPaidByDep(deptNumber));
        System.out.println("============================================================");

        System.out.println("Enter the number of department to find total salary");
        deptNumber = in.nextInt();
        System.out.print("Total salary in department " + deptNumber + ":");
        System.out.printf("%.2f\n", findTotalSalaryByDep(deptNumber));
        System.out.println("============================================================");

        System.out.println("Enter the number of department to find average salary");
        deptNumber = in.nextInt();
        System.out.print("Average salary in department " + deptNumber + ":");
        System.out.printf("%.2f\n", findAverageSalaryByDep(deptNumber));
        System.out.println("============================================================");

        System.out.println("Enter the number of department to index salary");
        deptNumber = in.nextInt();
        System.out.println("Enter the percentage to index salary");
        int percent = in.nextInt();
        System.out.println("Before indexing:");
        showEmployeesByDept(deptNumber);
        indexSalaryByDept(deptNumber, percent);
        System.out.println("After indexing:");
        showEmployeesByDept(deptNumber);
        System.out.println("============================================================");

        System.out.println("Enter the borderline salary: ");
        double amount = in.nextDouble();
        System.out.println("Employees with lower salary:");
        showEmployeesWithLowerSalary(amount);
        System.out.println("Employees with equal or higher salary:");
        showEmployeesWithHigherSalary(amount);
        System.out.println("============================================================");

        in.close();
    }
}
