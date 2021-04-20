package com.kodilla.collections.adv.immutable.homework;

public final class Task {

    protected String title;
    protected int duration;

    public Task(String title, int duration) {
        this.duration = duration;
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}