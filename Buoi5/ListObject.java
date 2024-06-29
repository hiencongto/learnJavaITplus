package Buoi5;

import java.util.ArrayList;
import java.util.List;
import Buoi3.bvnStudent;

public class ListObject {
    public static void main(String[] args) {
        ArrayList<bvnStudent> studentList = new ArrayList<>();
        bvnStudent studentObject = new bvnStudent("a", 10, "nam", 6);
        studentList.add(studentObject);
        // Student demo = studentList.get(0);
        // System.out.println(demo.getAge());
    }
}
