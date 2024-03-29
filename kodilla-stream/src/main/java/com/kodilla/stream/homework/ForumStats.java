package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .map(u -> u.getAge())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg);
//
        double avg2 = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .map(u -> u.getAge())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg2);
    }
}