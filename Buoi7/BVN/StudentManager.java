package Buoi7.BVN;

import java.util.List;
import java.util.Scanner;

public class StudentManager {

    public static List<Student> students;
    public static List<Classroom> classrooms;

    public StudentManager(List<Student> students, List<Classroom> classrooms) {
        this.students = students;
        this.classrooms = classrooms;
    }

    private static String inputWithValidation(Scanner scanner, String script, String errorMsg, boolean isNumeric) {
        int check = 3;
        while (check > 0) {
            if (isNumeric) {
                System.out.print(script);
                String value = scanner.nextLine();
                try {
                    int num = Integer.parseInt(value);
                    if (num >= 7 && num <= 17) {
                        return value;
                    } else {
                        System.out.println(errorMsg);
                    }
                } catch (NumberFormatException e) {
                    System.out.println(errorMsg);
                }
            } else {
                System.out.println(script);
                String[] genders = { "Nam", "Nữ" };
                for (int i = 0; i <= 1; i++) {
                    System.out.println((i + 1) + ". " + genders[i]);
                }
                String choice = scanner.nextLine();
                try {
                    int index = Integer.parseInt(choice) - 1;
                    if (index >= 0 && index <= 1) {
                        return genders[index];
                    }
                } catch (NumberFormatException e) {
                    System.out.println(errorMsg);
                }
            }
            check--;
        }
        System.out.println("Bạn đã vượt quá số lần thử.");
        return null;
    }

    public static void createStudent(Scanner scanner) {
        System.out.print("Nhập tên học sinh: ");
        String name = scanner.nextLine();

        String ageStr = inputWithValidation(scanner, "Nhập tuổi học sinh: ",
                "Tuổi không hợp lệ. Tuổi phải là số từ 7 đến 17.", true);
        if (ageStr == null)
            return;
        int age = Integer.parseInt(ageStr);

        String gender = inputWithValidation(scanner, "Nhập giới tính học sinh (nam/nữ): ",
                "Giới tính không hợp lệ.", false);

        System.out.print("Nhập địa chỉ học sinh: ");
        String address = scanner.nextLine();

        System.out.print("Nhập điểm học sinh: ");
        double pointAvg = Double.parseDouble(scanner.nextLine());

        Classroom classroom = chooseClassroom(scanner);
        if (classroom == null)
            return;

        students.add(new Student(name, age, gender, address, pointAvg, classroom));
        System.out.println("Thêm học sinh thành công.");
    }

    public static Classroom chooseClassroom(Scanner scanner) {
        System.out.println("Chọn lớp học:");
        for (int i = 0; i < classrooms.size(); i++) {
            System.out.println((i + 1) + ". " + classrooms.get(i).getName());
        }
        String choice = scanner.nextLine();
        try {
            int index = Integer.parseInt(choice) - 1;
            if (index >= 0 && index < classrooms.size()) {
                return classrooms.get(index);
            }
        } catch (NumberFormatException e) {

        }
        System.out.println("Lựa chọn không hợp lệ.");
        return null;
    }

    public static void updateStudent(Scanner scanner) {
        System.out.print("Nhập tên học sinh cần cập nhật: ");
        String name = scanner.nextLine();
        Student student = findStudentByName(name);
        if (student == null) {
            System.out.println("Không tìm thấy học sinh.");
            return;
        }

        System.out.print("Nhập tên mới cho học sinh (hiện tại: " + student.getName() + "): ");
        String newName = scanner.nextLine();
        if (!newName.isEmpty()) {
            student.setName(newName);
        }

        System.out.print("Nhập tuổi mới cho học sinh (hiện tại: " + student.getAge() + "): ");
        String newAgeStr = scanner.nextLine();
        if (!newAgeStr.isEmpty()) {
            try {
                int newAge = Integer.parseInt(newAgeStr);
                if (newAge >= 7 && newAge <= 17) {
                    student.setAge(newAge);
                } else {
                    System.out.println("Tuổi không hợp lệ. Tuổi phải là số từ 7 đến 17.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Tuổi không hợp lệ. Vui lòng nhập số.");
            }
        }

        System.out.print("Nhập giới tính mới cho học sinh (hiện tại: " + student.getGender() + "): ");
        String newGender = scanner.nextLine();
        if (!newGender.isEmpty()) {
            student.setGender(newGender);
        }

        System.out.print("Nhập địa chỉ mới cho học sinh (hiện tại: " + student.getAddress() + "): ");
        String newAddress = scanner.nextLine();
        if (!newAddress.isEmpty()) {
            student.setAddress(newAddress);
        }

        System.out.print("Nhập điểm trung bình mới cho học sinh (hiện tại: " + student.getPointAvg() + "): ");
        String newPointAvgStr = scanner.nextLine();
        if (!newPointAvgStr.isEmpty()) {
            try {
                double newPointAvg = Double.parseDouble(newPointAvgStr);
                if (newPointAvg >= 0 && newPointAvg <= 10) {
                    student.setPointAvg(newPointAvg);
                } else {
                    System.out.println("Điểm không hợp lệ. Điểm phải là số từ 0 đến 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Điểm không hợp lệ. Vui lòng nhập số.");
            }
        }

        Classroom newClassroom = chooseClassroom(scanner);
        if (newClassroom != null) {
            student.setClassroom(newClassroom);
        }

        System.out.println("Cập nhật thông tin học sinh thành công.");
    }

    public static Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public static void deleteStudent(Scanner scanner) {
        System.out.print("Nhập tên học sinh cần xóa: ");
        String name = scanner.nextLine();
        Student student = findStudentByName(name);
        if (student != null) {
            students.remove(student);
            System.out.println("Xóa học sinh thành công.");
        } else {
            System.out.println("Không tìm thấy học sinh.");
        }
    }

    public static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách học sinh trống.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public static void displayStudentsByPoint() {
        if (students.isEmpty()) {
            System.out.println("Danh sách học sinh trống.");
        } else {
            for (int i = 0; i < students.size() - 1; i++) {
                for (int j = i + 1; j < students.size(); j++) {
                    if (students.get(i).getPointAvg() < students.get(j).getPointAvg()) {
                        Student temp = students.get(i);
                        students.set(i, students.get(j));
                        students.set(j, temp);
                    }
                }
            }
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public static void displayStudentsByClassroom(Scanner scanner) {
        Classroom classroom = chooseClassroom(scanner);
        if (classroom == null)
            return;

        boolean found = false;
        for (Student student : students) {
            if (student.getClassroom().equals(classroom)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có học sinh nào trong lớp " + classroom.getName() + ".");
        }
    }
}
