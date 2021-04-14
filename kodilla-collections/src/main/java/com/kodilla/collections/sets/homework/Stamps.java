package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamps {
    private String stampName;
    private int stampSize;
    private boolean stampStamped;

    public Stamps(String stampName, int stampSize, boolean stampStamped) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.stampStamped = stampStamped;

    }

    public String getStampName() {
        return stampName;
    }

    public int getStampSize() {
        return stampSize;
    }

    public boolean getStampStamped() {
        return stampStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamps stamps = (Stamps) o;
        return stampSize == stamps.stampSize && stampStamped == stamps.stampStamped && Objects.equals(stampName, stamps.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, stampStamped);
    }

    @Override
    public String toString() {
        return "Stamps{" +
                "stampName='" + stampName + '\'' +
                ", stampSize=" + stampSize +
                ", stampStamped=" + stampStamped +
                '}';
    }
}
