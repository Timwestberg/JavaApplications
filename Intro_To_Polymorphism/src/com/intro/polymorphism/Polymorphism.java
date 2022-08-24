package com.intro.polymorphism;

public class Polymorphism {

    public static void main(String[] args) {

        Dog howl = new Dog();

        Animal apollo = new Animal();

        /**
         *  Overloading Allows the creation of the same method by passing different options.
         *  We can make as many methods as we want with the same name as long as the arguments (signature) is unique
         */
        apollo.makeSound();

        howl.makeSound("dog");

        howl.makeSound("dog", 1);

        /**
         *  Overriding Methods allows us to customize behaviors based on the class
         *  More specific type of behaviors related to the child class should be implemented using Overrides.
         */

        howl.makeSound();

        /**
         *  We are able to pass Polymophric Arguments
         *  and the system is able to figure out which methods are supposed to be called based on the class
         */

        Vet myVet = new Vet();

        Cat callie = new Cat();
        Dog brutis = new Dog();

        myVet.giveShot(callie);
        myVet.giveShot(brutis);

    }
}
