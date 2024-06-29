package Buoi3;

import java.util.ArrayList;

public class bvnMain {
    public static void main(String[] args) {
        bvnStudent student1 = new bvnStudent("Name1", 18, "Nam", 8);
        bvnStudent student2 = new bvnStudent("Name2", 19, "Nữ", 9);
        bvnStudent student3 = new bvnStudent("Name3", 20, "Nam", 10);

        // array student
        bvnStudent[] students_array = { student1, student2, student3 };

        // element
        double highestMark = student1.getPoint();
        String nameStudentHighestMark = student1.getName();
        int highestAge = student1.getAge();
        String inforOldestStudent = student1.toString();

        // because array cant change size, so i try to use arraylist
        // but i still dont know clearly about that
        ArrayList<String> nameMales = new ArrayList<>();

        for (bvnStudent student_array : students_array) {

            // check highest mark and set name to nameStudentHighestMark
            if (student_array.getPoint() > highestMark) {
                highestMark = student_array.getPoint();
                nameStudentHighestMark = student_array.getName();
            }

            // check gender is "Nam", add name to arraylist nameMale
            // if (student_array.getGender().equals("Nam")) {
            // nameMales.add(student_array.getName());
            // }

            if (student_array.isMale()) {
                nameMales.add(student_array.getName());
            }

            // check highest age
            if (student_array.getAge() > highestAge) {
                inforOldestStudent = student_array.toString();
            }
        }

        // print in order: the highest mark, name student that male, info the oldest
        // student
        System.out.println("Diem cao nhat " + nameStudentHighestMark);
        for (String nameMale : nameMales) {
            System.out.println("Hoc vien gioi tinh nam: " + nameMale);
        }
        System.out.println(inforOldestStudent);

        /*
         * result:
         * Diem cao nhat Name3
         * Hoc vien gioi tinh nam: Name1
         * Hoc vien gioi tinh nam: Name3
         * Ten Name3, Tuoi 20, Gioi tinh Nam, Diem so 10.0
         */
    }
}
