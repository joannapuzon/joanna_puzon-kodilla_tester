package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal gerrard = new Principal("Gerrard", "Kowalski");
        Principal john = new Principal("John", "Johnson");
        Principal sophia = new Principal("Sophia", "Lorenz");

        School winston = new School(450);
        School california = new School(1530);
        School miami = new School(950);

        school.put(gerrard, california);
        school.put(john, winston);
        school.put(sophia, miami);

        for (Map.Entry<Principal, School> schoolEntry : school.entrySet())
            System.out.println(schoolEntry.getKey().getFirstName() + " , Number of students: " + schoolEntry.getValue().getStudentNumbers());
    }
}