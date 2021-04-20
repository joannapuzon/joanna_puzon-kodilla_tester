package com.kodilla.collections.adv.immutable.homework;

public class TaskChecking extends Task {
    private String realTitle;

    public TaskChecking(String title, int duration){
        super(title, duration);
        realTitle = title;
    }

    public void modifyTitle(String newTitle) {realTitle = newTitle;}


    public String getRealTitle() {
        return realTitle;
    }
}