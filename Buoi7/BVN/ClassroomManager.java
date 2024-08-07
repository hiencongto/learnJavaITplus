package Buoi7.BVN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassroomManager {

    public ArrayList<Classroom> classrooms = new ArrayList<>();

    public ClassroomManager() {
        this.classrooms.add(new Classroom("Class 1"));
        this.classrooms.add(new Classroom("Class 2"));
        this.classrooms.add(new Classroom("Class 3"));
    }

    public void createNewClassroom(Scanner scanner) {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        Classroom classroom = new Classroom(name);
        this.classrooms.add(classroom);
    }

    public void displayAllClassroom() {
        for (Classroom classroom : this.classrooms) {
            System.out.println(classroom);
        }
    }

    public Classroom getByID(int id) {
        for (Classroom classroom : this.classrooms) {
            if (classroom.getId() == id) {
                return classroom;
            }
        }
        return null;
    }

}
