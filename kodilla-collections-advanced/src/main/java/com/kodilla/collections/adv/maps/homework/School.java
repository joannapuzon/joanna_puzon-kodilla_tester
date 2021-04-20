package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> studentNumbers = new ArrayList<>();

    public School(double... studentNumbers) {
//        dlaczego tylko z kropkami działa
        for (double studentNumber : studentNumbers)
            this.studentNumbers.add(studentNumber);
    }

    public List<Double> getStudentNumbers() {
        return studentNumbers;
    }
}