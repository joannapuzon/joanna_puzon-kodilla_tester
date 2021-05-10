package com.kodilla.stream.homework;

import java.time.LocalDate;

public class TaskManager {
    public static void main(String[] args) {
        TaskRepository.getTask()
                .stream()
                .filter(task -> task.getDeadline().equals(LocalDate.now()))
                .map(Task::getDeadline)
                .forEach(tn -> System.out.println(tn));

    }
}