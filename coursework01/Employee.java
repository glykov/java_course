public class Employee {
    private static int counter = 1;
    private int id;
    private String firstName;
    private String lastName;
    private int dept;
    private double salary;

    public Employee(String firstName, String lastName, int dept, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
        this.salary = salary;
        id = counter;
        counter++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getDepartment() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + getFullName() 
            + ", depatrment: " + dept + ", salary: " + salary; 
    }

    public void setDepartment(int dept) {
        this.dept = dept;
    }
    
    public void setSalary(double amount) {
        salary = amount;
    }
}
