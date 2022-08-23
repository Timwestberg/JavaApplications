package com.intro.classes;

/**
 * Created by Tim Westberg 08/2022
 */
public class Ball {
    // Blueprint

    // Children Classes
    // Properties or instance Variables
    public String color;
    public String name;
    public int capacity;
    public int bounceRate;

    /*
        Public - anyone can access
        Private - Only accessed using the class
     */

    // Behaviors
    public void bounce() {
        System.out.println("BOUNCING...");
    }

    public void deflate() {
        System.out.println("DEFLATING...");
    }

    public void inflate() {
        System.out.println("INFLATING...");
    }
}
