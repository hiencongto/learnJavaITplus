package Buoi3;

public class bvnStudent {
    private String name;
    private int age;
    private String gender;
    private double point;

    public bvnStudent() {

    }

    public bvnStudent(String name, int age, String gender, double point) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    // checks if the provided gender string indicates male.
    public boolean isMale() {
        return this.gender.equals("Nam");
    }

    // return all student's informations
    public String toString() {
        String infomation = "Ten " + this.name + ", Tuoi " + this.age
                + ", Gioi tinh " + this.gender + ", Diem so " + this.point;

        return infomation;
    }

}
