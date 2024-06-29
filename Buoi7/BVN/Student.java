package Buoi7.BVN;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String address;
    private double pointAvg;
    private Classroom classroom;

    public Student() {

    }

    public Student(String name, int age, String gender, String address, double pointAvg, Classroom classroom) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.pointAvg = pointAvg;
        this.classroom = classroom;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPointAvg() {
        return pointAvg;
    }

    public void setPointAvg(double pointAvg) {
        this.pointAvg = pointAvg;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Address: " + address + ", PointAvg: "
                + pointAvg + ", Classroom: " + classroom.getName();
    }
}
