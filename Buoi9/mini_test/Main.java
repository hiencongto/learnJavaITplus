package Buoi9.mini_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonManager personManagers = new PersonManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----- Quản lý nhân sự -----");
            System.out.println("1. Tạo mới thông tin 1 person");
            System.out.println("2. Sửa thông tin 1 person theo id");
            System.out.println("3. Xóa thông tin 1 person theo id");
            System.out.println("4. Hiển thị tất cả person");
            System.out.println("5. Ghi danh sách person vào file");
            System.out.println("6. Đọc danh sách person từ file");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    personManagers.createPerson(scanner);
                    break;
                case 2:
                    personManagers.updatePersonById(scanner);
                    break;
                case 3:
                    personManagers.deletePersonById(scanner);
                    break;
                case 4:
                    personManagers.displayAllPersons();
                    break;
                case 5:
                    personManagers.savePersonsToFile();
                    break;
                case 6:
                    List<Person> personList = personManagers.loadPersonsFromFile();
                    for (Person person : personList) {
                        System.out.println(person.toString());
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        } while (choice != 0);
    }
}
