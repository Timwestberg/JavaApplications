package com.intro.classes;

public class Main {

    public static void main(String[] args) {

        Ball myBall = new Ball();

        myBall.color = "Blue";
        myBall.name = "Basketball";
        myBall.capacity = 25;

        System.out.println("Tim's Custom Ball is a " + myBall.color + " " + myBall.name);
    }
}
