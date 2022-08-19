package com.intro.methods;

public class Main {
    public static void main(String[] args) {

        // Methods must be called from the main function to be ran
        methodName();
        methodName2();

        parameterMethod("Tim");

        parameterMethod2AddNumbers(5,8);

        // function returns int data that can then be manipulated
        int area = getArea(10,10) + 23;

        System.out.println("The Area is " + area);

        // function can return String
        String fullName = fullName("Jonny", "Bravo");

        System.out.println("Testers full name is " + fullName);

        // Function can return boolean
        boolean isPirateKing = isTrue(true, true);

        System.out.println("Is Luffy now The King of The Pirates? " + isPirateKing);
    }


    // Every Method must have a name
    public static void methodName(){
        System.out.println("Tim's Intro to Java Methods");
    }

    // Methods must have unique names
    public static  void methodName2(){
        System.out.println("This is a second method being called.");
    }

    // We can pass in Parameters for functions
    public static void parameterMethod(String name){
        System.out.println(name + " Is testing the code");

    }

    // Function that returns an integer
    public static int getArea(int width,int height){

        return width * height;
    }

    // Function with Multiple Parameters
    public static void parameterMethod2AddNumbers(int par1,int par2) {
        int mathProblemResult = par1 * par2;
        System.out.println("The Solution to " + par1 + " * " + par2 + " is " + mathProblemResult);
    }

    public static String fullName(String firstName, String lastName) {

        return firstName + " " + lastName;
    }

    public static boolean isTrue(boolean hakiKing, boolean devilFruitGoed) {

        if(hakiKing != devilFruitGoed) {
            return hakiKing;
        }else{
                return devilFruitGoed;
            }
        }

    }

