package com.intro.polymorphism;

public class Dog extends Animal{
    private String name;

    public void move(){
        System.out.println("Moving....");
    }

    public void makeSound(){
        System.out.println("Woof, Woof, Bark!");
    }
}
