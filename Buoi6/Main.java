package learnJavaITplus.Buoi6;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new FullTimeEmployee("Nguyen Van A", 30, 5000, 40),
                new PartTimeEmployee("Le Thi B", 25, 20, 20),
                new FullTimeEmployee("Tran Van C", 40, 7000, 40),
                new PartTimeEmployee("Pham Thi D", 22, 15, 25)
        };

        for (Employee employee : employees) {
            double salary = employee.calculateSalary();
            double tax = ((Taxable) employee).calculateIncomeTax();
            System.out.println("Employee: " + employee.getName() + ", Age: " + employee.getAge());
            System.out.println("Salary: " + salary + ", Income Tax: " + tax);
            System.out.println("");
        }
    }
}
