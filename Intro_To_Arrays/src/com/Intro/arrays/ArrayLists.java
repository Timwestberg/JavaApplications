package com.Intro.arrays;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        //Array Lists - Elastic Length, no need to define size
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Dog");

        System.out.println("Current Animal List: " + animals);

        animals.add("Cat");
        animals.add("Monkey");

        System.out.println("Current Animal List: " + animals);

        System.out.println("Current Animal List size: " + animals.size());

        if(animals.isEmpty()) {
            System.out.println("Array List is Empty!");
        } else {
            // First Way to do a For Loop
            for (int i = 0; i < animals.size(); i++){
                System.out.println("Old For Loop Animal " + animals.get(i));
            }

            // Cleaner way to perform a For Loop | Newest Method
            for(String animal : animals){
                System.out.println("new For Loop Animal: " + animal);
            }

        }

        if(animals.contains("Cat")){
            animals.remove("Cat");
            animals.add("Chicken");
        } else {
            animals.add("Chicken");
        }

        for(String animal : animals){
            System.out.println("new For Loop Animal: " + animal);
        }

        // Multiple ways to remove elements from an Array

        animals.remove(0);
        animals.add(0, "Dog");
        animals.remove("Chicken");

        for(String animal : animals){
            System.out.println("Current Animal List: " + animal);
        }

        ArrayList animals2 = new ArrayList();

        animals2.add(32);
        animals2.add("Cow");
        animals2.add("Pig");
        animals2.add("Cheetah");
        animals2.add("Horse");

        if( animals2.contains("Parrot")) {
            animals.remove("Parrot");
        } else {
            System.out.println("No Parrot");
        }

        // Clever for loop
        for(Object animal2 : animals2){
            System.out.println("Current Animal List: " + animal2);
        }

    }
}
