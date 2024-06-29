
package Buoi6;

public abstract class Employee {
    private String name;
    private int age;
    protected double baseSalary;

    public Employee(String name, int age, double baseSalary) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateSalary();
}
