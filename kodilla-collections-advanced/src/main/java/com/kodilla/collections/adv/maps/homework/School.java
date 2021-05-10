package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> studentNumbers = new ArrayList<>();
    private String schoolName;

    public School(String schoolName, int... studentNumbers) {
        this.schoolName = schoolName;
//        dlaczego tylko z kropkami działa
        for (int studentNumber : studentNumbers)
            this.studentNumbers.add(studentNumber);
    }

    public List<Integer> getStudentNumbers() {
        return studentNumbers;
    }

    public String getSchoolName() {
        return schoolName;
    }
}