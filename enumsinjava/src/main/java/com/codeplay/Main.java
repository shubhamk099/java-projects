package com.codeplay;

public class Main {
    public static void main(String[] args) {
        System.out.println(DaysOfWeek.SUNDAY);
        System.out.println(DaysOfWeek.MONDAY);
        System.out.println(DaysOfWeek.SATURDAY);

        // to get the ordinal number of enum (index-no)
        System.out.println(DaysOfWeek.SATURDAY.ordinal());

        // to check whether a specific enum present or not
        DaysOfWeek daysOfWeek = DaysOfWeek.valueOf("FRIDAY");
        System.out.println(daysOfWeek);

        // get all enums in an array
        System.out.println("List of all enums : ");
        DaysOfWeek[] values = DaysOfWeek.values();
        for (DaysOfWeek day : values) {
            System.out.println(day);
        }
    }
}