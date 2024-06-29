package Buoi6;

public class FullTimeEmployee extends Employee implements Taxable {

    private int weeklyHours;

    public FullTimeEmployee(String name, int age, double baseSalary, int weeklyHours) {
        super(name, age, baseSalary);
        this.weeklyHours = weeklyHours;
    }

    @Override
    public double calculateSalary() {
        // Giả sử mỗi tuần làm việc 4 tuần mỗi tháng
        return baseSalary*weeklyHours*4;
    }

    @Override
    public double calculateIncomeTax() {
        // Giả sử thuế thu nhập là 10% lương
        return calculateSalary() * 0.1;
    }

}
