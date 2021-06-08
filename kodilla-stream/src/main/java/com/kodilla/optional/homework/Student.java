package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    String name;
    Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    private String validatingIfNull() {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);
        return optionalTeacher.orElse(new Teacher("<undefined>")).getName();
    }

    @Override
    public String toString() {
        String teacher = validatingIfNull();

        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}