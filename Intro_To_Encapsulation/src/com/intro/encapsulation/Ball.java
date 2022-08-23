package com.intro.encapsulation;

// Blueprint -- Tim Westberg 08/22
public class Ball {
    // Blueprint

    // Children Classes
    // Properties or instance Variables

    /*
        Public - anyone can access
        Private - Only accessed using the class - Instance Variables should be Private
    */

    private String owner;
    private String color;
    private String ballType;
    private int capacity;
    private int bounceRate;


    // Default Constructor
    public Ball(){

    }

    // Single Parameter Signature
    public Ball(String mColor){
        setColor(mColor);
    }

    // Even though constructors can have the same name, they must still be unique in purpose (Must have different signatures)
    // Two Parameter Signature
    public Ball(String mColor, String mName){
        setColor(mColor);
        setOwner(mName);
    }

    // Three Parameter Signature
    public Ball(String mColor, String mName, int mCapacity){
        setColor(mColor);
        setOwner(mName);
        setCapacity(mCapacity);

    }

    // Constructor that requires the use of 'this'
    //    public Ball(String name, String color, int capacity, int bounceRate) {
    //        this.name = name;
    //        this.color = color;
    //        this.capacity = capacity;
    //        this.bounceRate = bounceRate;
    //    }

    // Constructor not requiring the use of 'this'
    // Four Parameter Signature
    public Ball(String mName, String mColor, int mCapacity, int mBounceRate) {
        owner = mName;
        color = mColor;
        capacity = mCapacity;
        bounceRate = mBounceRate;
    }


    // Method that uses Getters to pull class data.
    public void showBallData(){
        System.out.println("The " + getBallType() +  "'s Owner is " + getOwner());
        System.out.println("The " + getBallType() +  "'s  Color is " + getColor());
        System.out.println("The " + getBallType() +  "'s  Capacity is " + getCapacity());
        System.out.println("The " + getBallType() +  "'s  Bounce Rate is " + getBounceRate());
    }

    // Getters - Used to Get current Value for the Variable Key
    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBounceRate() {
        return bounceRate;
    }

    public String getBallType() {
        return ballType;
    }
    // Setters - Used to Set Value for the Variable Key
    public void setOwner(String name) {
        this.owner = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setBounceRate(int bounceRate) {
        this.bounceRate = bounceRate;
    }

    public void setBallType(String ballType) {
        this.ballType = ballType;
    }



    // Behaviors - Logic related to the Class
    public void bounce(){
        System.out.println("Bouncing....");
    }

    public void inflating(){
        System.out.println("Inflating....");
    }

    public void deflating(){
        System.out.println("Deflating....");
    }
}
