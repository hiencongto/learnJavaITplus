package Buoi6;

public class PartTimeEmployee extends Employee implements Taxable {
    private int weeklyHours;
    private double hourlyRate;

    public PartTimeEmployee(String name, int age, double hourlyRate, int weeklyHours) {
        super(name, age, hourlyRate);
        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        // Giả sử mỗi tuần làm việc 4 tuần mỗi tháng
        return hourlyRate * weeklyHours * 4;
    }

    @Override
    public double calculateIncomeTax() {
        // Giả sử thuế thu nhập là 10% lương
        return calculateSalary() * 0.1;
    }
}
