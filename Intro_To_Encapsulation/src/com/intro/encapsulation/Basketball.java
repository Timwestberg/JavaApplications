package com.intro.encapsulation;

// Blueprint -- Tim Westberg 08/22
// Baseball is now a child of Ball and has now inherited the instance variables and behaviors of Ball
public class Basketball extends Ball{

    // Children Classes
    // Properties or instance Variables


    /*
            Public - anyone can access
            Private - Only accessed using the class
        */
    private boolean isNBA;

    // Behaviors
    public boolean isNBA(){
        int currentBounceRate = getBounceRate();
        int currentCapacity = getCapacity();
        if( currentBounceRate > 60 && currentCapacity < 30){
            return true;
        }else {
            return false;
        }
    }

    // Setter
    public void setNBA() {
        isNBA = isNBA();
    }

    // Getter
    public boolean getNBA() {
        return isNBA;
    }


    // Default Constructor
    public Basketball(){

    }

    // Single Parameter Signature
    public Basketball(int mBounceRate){
        setBounceRate(mBounceRate);
    }

    // Even though constructors can have the same name, they must still be unique in purpose (Must have different signatures)
    // Two Parameter Signature
    public Basketball(String mColor, String mOwner){
        setColor(mColor);
        setOwner(mOwner);
    }

    // Three Parameter Signature
    public Basketball(String mColor, String mName, int mCapacity){
        setColor(mColor);
        setOwner(mName);
        setCapacity(mCapacity);

    }

    // Constructor not requiring the use of 'this'
    // Four Parameter Signature
    public Basketball(String mColor, String mName, int mCapacity, int mBounceRate) {
        setColor(mColor);
        setOwner(mName);
        setCapacity(mCapacity);
        setBounceRate(mBounceRate);
    }

    // Overrides

    @Override
    public void bounce(){
        String ballOwner = getOwner();
        String ballType = getBallType();
        System.out.println(ballOwner + ballType + " is bouncing....");
    }

    @Override
    public void showBallData() {
        super.showBallData();

        String ballOwner = getOwner();
        String ballType = getBallType();

        System.out.println("is " + ballOwner + " " + ballType + " a NBA Ball ? | ");

    }
}
