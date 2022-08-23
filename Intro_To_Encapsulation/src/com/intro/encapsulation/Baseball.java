package com.intro.encapsulation;

// Blueprint -- Tim Westberg 08/22
public class Baseball extends Ball {

    // Children Classes
    // Properties or instance Variables

    /*
        Public - anyone can access
        Private - Only accessed using the class
    */

    private boolean isMLB;

    // Behaviors
    public boolean isMLB(){
        int currentBounceRate = getBounceRate();
        int currentCapacity = getCapacity();
        if( currentBounceRate > 30 && currentCapacity < 6){
            return true;
        }else {
            return false;
        }
    }

    // Default Constructor
    public Baseball(){

    }

    // Single Parameter Signature
    public Baseball(int mBounceRate){
        setBounceRate(mBounceRate);
    }

    // Even though constructors can have the same name, they must still be unique in purpose (Must have different signatures)
    // Two Parameter Signature
    public Baseball(String mColor, String mOwner){
        setColor(mColor);
        setOwner(mOwner);
    }

    // Three Parameter Signature
    public Baseball(String mColor, String mName, int mCapacity){
        setColor(mColor);
        setOwner(mName);
        setCapacity(mCapacity);

    }

    // Constructor not requiring the use of 'this'
    // Four Parameter Signature
    public Baseball(String mColor, String mName, int mCapacity, int mBounceRate) {
        setColor(mColor);
        setOwner(mName);
        setCapacity(mCapacity);
        setBounceRate(mBounceRate);
    }

    @Override
    public void bounce(){
        String ballOwner = getOwner();
        String ballType = getBallType();
        System.out.println(ballOwner + ballType + " is bouncing....");
    }

}
