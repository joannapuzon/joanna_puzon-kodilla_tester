package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamps> stamp = new HashSet<>();
        stamp.add(new Stamps("Poland", 12, true));
        stamp.add(new Stamps("Germany", 10, false));
        stamp.add(new Stamps("Greece", 15, true));
        stamp.add(new Stamps("Poland", 12, true));

        System.out.println(stamp.size());
        for (Stamps stamps : stamp)
            System.out.println(stamps);


    }
}
