package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    LocalDate currentDate = LocalDate.now();

    public static List<Task> getTask() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Checking mail box", LocalDate.of(2021, 5, 1), LocalDate.of(2021, 5, 9)));
        tasks.add(new Task("Make a sales report", LocalDate.of(2021, 5, 9), LocalDate.of(2021, 5, 10)));
        tasks.add(new Task("Set sales goal for next month", LocalDate.of(2021, 5, 12), LocalDate.of(2021, 5, 18)));
        return tasks;

    }
}