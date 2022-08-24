package com.intro.statickeyword;

public class Static {

    // Instance Variables must be static in order to be access from other static methods without instantiating it.
    private static String name;

    public static void main(String[] args) {

        int myValue = -45;
        int secondValue = 56;

        int x = Math.min(myValue, secondValue);
        int y = Math.abs(myValue);

        System.out.println("The Min Value is: " + x);
        System.out.println("The Non-negative number is: " + y);

        setName("Tim");

        System.out.println("Owner's name is: " + name);

    }

    // The Setter must also be static in order for
    // the other static method to have access without instantiating a project class
    public static void setName(String n){
        name = n;
    }
}
