package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", new Teacher("Ronald")));
        students.add(new Student("Olga", null));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}