package com.intro.errorhandling;

public class Main {

    public static void main(String[] args) {

        String[] myArray = {"Hello", "Hi", "Hey"};

//        System.out.println(myArray[3]);

        float sum = 0;


        for (String argument : args) {
            try {
                sum = sum + Float.parseFloat(argument);
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("Exception Message: " + e.getMessage());
                System.out.println(argument + " IS NOt a number!");
            }
        }

        System.out.println("Sum is: " + sum);

    }
}
