package com.codeplay;

public enum ChargeLevel {
    FULL(4, "green"),
    HIGH(3, "green"),
    MEDIUM(2, "yellow"),
    LOW(1, "red");

    // try to make enum fields final
    private final int sections;
    private final String color;

    // enum constructor can't be public
    private ChargeLevel(int sections, String color) {
        this.sections = sections;
        this.color = color;
    }

    public int getSections() {
        return sections;
    }

    public String getColor() {
        return color;
    }

    // a static method to return enum if sections are given
    public static ChargeLevel findByNumberOfSections(int sections) {
        for (ChargeLevel value : ChargeLevel.values()) {
            if (value.sections == sections) {
                return value;
            }
        }
        return null;
    }
}
