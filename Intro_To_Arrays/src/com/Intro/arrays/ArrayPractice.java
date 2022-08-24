package com.Intro.arrays;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        //Arrays
        int [] arrInts = {2,4,6,8};
        String [] arrStrings = {"Bathroom", "Kitchen", "Living Room"};
        boolean [] arrBoolean = {true, false, true , true};

        for (int i = 0; i < arrInts.length; i++){
            System.out.println("Integer: " + arrInts[i]);
        }

        for (int i = 0; i < arrStrings.length; i++){
            System.out.println("Strings: " + arrStrings[i]);
        }

        for (int i = 0; i < arrBoolean.length; i++){
            System.out.println("Boolean: " + arrBoolean[i]);
        }

        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        String[] myStringArray = {"Hello", "Hi", "Hey"};

        int[] newArray = new int[5];
        String[] newStringArray = new String[5];

        newArray[0] = 25;
        newArray[1] = 20;
        newArray[2] = 23;
        newArray[3] = 25;
        newArray[4] = 27;

        for (int i = 0; i < newArray.length; i++){
            System.out.println("New Array: " + newArray[i]);
        }

        newStringArray[3] = "Howdy";
        newStringArray[0] = "Sup";
        newStringArray[1] = "What!?";
        newStringArray[4] = "Yo";
        newStringArray[2] = "Yes?";

        for (int i = 0; i < newStringArray.length; i++){
            System.out.println("New String Array: " + newStringArray[i]);
        }

        // Sorting Arrays
        Arrays.sort(newStringArray);

        for(String word : newStringArray){
            System.out.println("Current Intro List: " + word);
        }

        Arrays.sort(arrInts);

        for(Integer number : arrInts){
            System.out.println("Current Number List: " + number);
        }
    }
}
