import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees = {
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
    public void showAllEmployees() {
        for (var e : employees) {
            System.out.println(e);
        }
    }

    // 2. Посчитать сумму затрат на зарплаты.
    public double calculateFullPayments() {
        double result = 0;
        for (var e : employees) {
            result += e.getSalary();
        }
        return result;
    }

    // 3. Найти сотрудника с минимальной заплатой
    public Employee getMinPaidEmployee() {
        Employee minPaid = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (minPaid.getSalary() > employees[i].getSalary()) {
                minPaid = employees[i];
            }
        } 
        return minPaid;
    }

    // 4. Найти сотрудника с максимальной зарплатой.
    public Employee getMaxPaidEmployee() {
        Employee maxPaid = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (maxPaid.getSalary() < employees[i].getSalary()) {
                maxPaid = employees[i];
            }
        } 
        return maxPaid;
    }

    // 5. Подсчитать среднее значение зарплат.
    public double getAverageSalary() {
        return calculateFullPayments() / employees.length;
    }

    // 6. Show the names of all employees
    public void showFullNames() {
        for (var e : employees) {
            System.out.println(e.getFullName());
        }
    }

    // 7. Indexing salaries by arbitrary %
    public void indexSalaries(int percent) {
        for (var e : employees) {
            double salary = e.getSalary();
            salary += salary * percent / 100.0;
            e.setSalary(salary);
        }
    }

    // 8.1 Find minimal salary by dept
    public Employee findMinPaidByDep(int deptNumber) {
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
    public Employee findMaxPaidByDep(int deptNumber) {
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
    public double findTotalSalaryByDep(int deptNumber) {
        double total = 0.0;
        for (var e : employees) {
            if (e.getDepartment() == deptNumber) {
                total += e.getSalary();
            }
        }
        return total;
    }

    // 8.4 Average salary by dept
    public double findAverageSalaryByDep(int deptNumber) {
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
    public void indexSalaryByDept(int deptNumber, int percent) {
        for (var e : employees) {
            if (e.getDepartment() == deptNumber) {
                double salary = e.getSalary();
                salary += salary * percent / 100.0;
                e.setSalary(salary);
            }
        }
    }

    // 8.6. Print the employees by dept
    public void showEmployeesByDept(int deptNumber) {
        for (var e : employees) {
            if (e.getDepartment() == deptNumber) {
                System.out.println("id: " + e.getId() + ", name: " + e.getFullName() 
                + ", salary: " + e.getSalary());
            }
        }
    }

    // 9.1. find employees with salary below the amount
    public void showEmployeesWithLowerSalary(double amount) {
        for (var e : employees) {
            if (e.getSalary() < amount) {
                System.out.println("id: " + e.getId() + ", name: " + e.getFullName() 
                + ", salary: " + e.getSalary());
            }
        }
    }

    // 9.1. find employees with salary above the amount
    public void showEmployeesWithHigherSalary(double amount) {
        for (var e : employees) {
            if (e.getSalary() >= amount) {
                System.out.println("id: " + e.getId() + ", name: " + e.getFullName() 
                + ", salary: " + e.getSalary());
            }
        }
    }

    // 10.1 Add employee
    public void addEmployee(String firstName, String lastName, int deptNo, double salary) {
        Employee emp = new Employee(firstName, lastName, deptNo, salary);
        employees = Arrays.copyOf(employees, employees.length + 1);
        employees[employees.length - 1] = emp;
    }

    // 10.2 Remove employee
    // if using removal by null assigment (as in task) it will affect other methods
    // so I prefer to really remove the item
    // utility method to merge arrays
    public Employee[] mergEmployees(Employee[] first, Employee[] second) {
        Employee[] tmp = new Employee[first.length + second.length];
        int i, j;
        for (i = 0; i < first.length; i++) {
            tmp[i] = first[i];
        }
        for (j = 0; j < second.length; j++, i++) {
            tmp[i] = second[j];
        }
        return tmp;
    } 

    public void removeEmployee(String fullName) {
        int idx;
        for (idx = 0; idx < employees.length; idx++) {
            if (fullName.equals(employees[idx].getFullName())) break;
        }
        if (idx == employees.length) {
            System.out.println("There is no such employee");
            return;
        }
        Employee[] e1 = Arrays.copyOfRange(employees, 0, idx);
        Employee[] e2 = Arrays.copyOfRange(employees, idx + 1, employees.length);
        employees = mergEmployees(e1, e2);
    }

    public void removeEmployee(int id) {
        int idx;
        for (idx = 0; idx < employees.length; idx++) {
            if (employees[idx].getId() == id) break;
        }
        if (idx == employees.length) {
            System.out.println("There is no such employee");
            return;
        }
        Employee[] e1 = Arrays.copyOfRange(employees, 0, idx);
        Employee[] e2 = Arrays.copyOfRange(employees, idx + 1, employees.length);
        employees = mergEmployees(e1, e2);
    }

    // 11. change employee record by name
    public void changeSalary(String fullName, double newSalary) {
        int idx;
        for (idx = 0; idx < employees.length; idx++) {
            if (fullName.equals(employees[idx].getFullName())) {
                employees[idx].setSalary(newSalary);
                break;
            }
        }
        if (idx == employees.length) {
            System.out.println("There is no such employee");
        }
    }

    public void changeDepartment(String fullName, int newDept) {
        int idx;
        for (idx = 0; idx < employees.length; idx++) {
            if (fullName.equals(employees[idx].getFullName())) {
                employees[idx].setDepartment(newDept);
                return;
            }
        }
        System.out.println("There is no such employee");
    }

    // 12. show employees by department
    public void showEmployeesByDept() {
        for (int deptNo = 1; deptNo <= 5; ++deptNo) {
            System.out.println("Department No" + deptNo);
            for (var e : employees) {
                if (e.getDepartment() == deptNo) {
                    System.out.println(e);
                }
            }
        }
    }

}
