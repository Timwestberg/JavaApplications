package com.intro.polymorphism;

// Example of Overloading Methods
public class Animal {
    private String name;

    public void makeSound(){
        System.out.println("Indistinct Sound.....");
    }

    public void makeSound(String soundType) {
        switch (soundType) {
            case "dog":
                System.out.println("Bark");
                break;
            case "cat":
                System.out.println("Meow");
                break;
            default:
                System.out.println("No animal Selected");
        }
    }

        public void makeSound(String soundType, int soundLevel){
            switch(soundType){
                case "dog":
                    System.out.println("Bark");
                    break;
                case "cat":
                    System.out.println("Meow");
                    break;
                default:
                    System.out.println("No animal Selected");
            }

            switch(soundLevel){
                case 1:
                    System.out.println("Growl");
                    break;
                case 2:
                    System.out.println("Cry");
                    break;
                default:
                    System.out.println("Whine");
            }

    }
}
