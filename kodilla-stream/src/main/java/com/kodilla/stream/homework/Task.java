package com.kodilla.stream.homework;

import java.time.LocalDate;

public class Task {
    String name;
    LocalDate opened;
    LocalDate deadline;

    public Task(String name, LocalDate opened, LocalDate deadline) {
        this.deadline = deadline;
        this.name = name;
        this.opened = opened;
    }

    public LocalDate getDeadline() {
        return deadline;
    }
}