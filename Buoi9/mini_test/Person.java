package Buoi9.mini_test;

import java.io.Serializable;

public class Person implements Serializable {
    private static int INDEX = 0;
    private int id;
    public String name;
    public int age;
    public String address;
    public String gender;

    public Person() {

    }

    public Person(String name, int age, String address, String gender) {
        this.id = ++INDEX;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person [id =" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", gender=" + gender
                + "]";
    }

}

// - Xây dựng chương trình quản lý nhân sự
// -Lớp Person : id , name, age, address. gender
// - Menu tính năng: - tạo mới thông tin 1 person, sưa thông tin 1 person theo
// id,
// xóa thông tin 1 person theo id, hiển thị tất cả person, ghi danh sách person
// vào file, đọc danh sách person từ file
// - Có xử lý Exception để không lỗi
