package Buoi9.mini_test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Buoi7.BVN.Student;

public class PersonManager {
    private List<Person> personList;
    // private Scanner scanner;

    public PersonManager() {
        personList = new ArrayList<>();
    }

    public void createPerson(Scanner scanner) {
        try {
            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập địa chỉ: ");
            String address = scanner.nextLine();
            System.out.print("Nhập giới tính: ");
            String gender = scanner.nextLine();
            Person person = new Person(name, age, address, gender);
            personList.add(person);
            System.out.println("Thêm mới thành công!");
        } catch (Exception e) {
            System.out.println("Nhập lại thông tin.");
            scanner.nextLine();
        }
    }

    public void updatePersonById(Scanner scanner) {
        System.out.print("Nhập ID cần sửa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Person person : personList) {
            if (person.getId() == id) {
                try {
                    System.out.print("Nhập tên mới: ");
                    person.setName(scanner.nextLine());
                    System.out.print("Nhập tuổi mới: ");
                    person.setAge(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Nhập địa chỉ mới: ");
                    person.setAddress(scanner.nextLine());
                    System.out.print("Nhập giới tính mới: ");
                    person.setGender(scanner.nextLine());
                    System.out.println("Cập nhật thành công!");
                    return;
                } catch (Exception e) {
                    System.out.println("Nhập lại thông tin.");
                    scanner.nextLine();
                }
            }
        }
        System.out.println("Không tìm thấy người có ID: " + id);
    }

    public void deletePersonById(Scanner scanner) {
        System.out.print("Nhập ID cần xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Person person : personList) {
            if (person.getId() == id) {
                try {
                    personList.remove(person);
                    System.out.println("Xóa thành công!");
                    return;
                } catch (Exception e) {
                    System.out.println("Nhập lại thông tin.");
                }
            }
        }
        System.out.println("Không tìm thấy người có ID: " + id);
    }

    public void displayAllPersons() {
        if (personList.isEmpty()) {
            System.out.println("Danh sách rỗng.");
        } else {
            for (Person person : personList) {
                System.out.println(person);
            }
        }
    }

    public void savePersonsToFile() {
        // try {
        // ObjectOutputStream obj = new ObjectOutputStream(new
        // FileOutputStream("personList"));
        // obj.writeObject(personList);
        // System.out.println("Lưu thành công!");
        // } catch (IOException e) {
        // System.out.println("Lỗi khi lưu file: ");
        // }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("personList.csv"));
            for (Person person : personList) {
                String str = person.getId() + "," + person.getName() + "\n";
                System.out.println(str);
                bufferedWriter.write(str);
                System.out.println("Lưu thành công!");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Person> loadPersonsFromFile() {
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("personList"));
            return (ArrayList<Person>) obj.readObject();
        } catch (Exception e) {
            System.out.println("Hãy thử lại");
        }
        return null;
        // ArrayList<Person> persons = new ArrayList<>();
        // try {
        // BufferedReader bufferedReader = new BufferedReader(new
        // FileReader("personList.csv"));
        // String str;
        // while ((str = bufferedReader.readLine()) != null){
        // String[] strs = str.split(",");
        // persons.add(new Person());

        // }
        // } catch (Exception e) {
        // // TODO: handle exception
        // }
    }

}
