package com.intro.encapsulation;

// -- Tim Westberg 08/22
public class Main {

    public static void main(String[] args) {
        // Set Data using Constructor for object
        Ball firstBall = new Ball("John's","Blue", 12, 45);

        firstBall.inflating();
        firstBall.bounce();
        firstBall.deflating();

        Ball secondBall = new Ball();

        // Set Data using setter methods
        secondBall.setOwner("Tim's");
        secondBall.setColor("Red");
        secondBall.setCapacity(45);
        secondBall.setBounceRate(50);

        secondBall.inflating();
        secondBall.bounce();
        secondBall.deflating();

        Ball thirdBall = new Ball("White-Red");

        thirdBall.setOwner("James's");
        thirdBall.setCapacity(15);
        thirdBall.setBounceRate(5);

        Ball fourthBall = new Ball("Yellow", "Jane's");

        fourthBall.setCapacity(30);
        fourthBall.setBounceRate(30);

        Ball fifthBall = new Ball("White", "Jack's", 2);

        fifthBall.setBounceRate(12);

        System.out.println("Show All Data for existing balls: ");
        firstBall.showBallData();
        secondBall.showBallData();
        thirdBall.showBallData();
        fourthBall.showBallData();
        fifthBall.showBallData();

        Baseball firstBaseball = new Baseball();

        firstBaseball.setColor("Blue");
        firstBaseball.setOwner("John's");
        firstBaseball.setCapacity(35);
        firstBaseball.setBounceRate(4);

        Baseball secondBaseball = new Baseball("White", "Tim's", 31, 20);

        Baseball thirdBaseball = new Baseball("Red", "Jane's");

        thirdBaseball.setCapacity(25);
        thirdBaseball.setBounceRate(3);

        Baseball fourthBaseball = new Baseball(2);

        fourthBaseball.setColor("Black");
        fourthBaseball.setOwner("Adam");
        fourthBaseball.setCapacity(23);

        Baseball fifthBaseball = new Baseball("Orange", "Jack's", 45);

        fifthBaseball.setBounceRate(2);

        Basketball firstBasketBall = new Basketball(62);

        firstBasketBall.setColor("Blue");
        firstBasketBall.setOwner("John's");
        firstBasketBall.setCapacity(35);

        Basketball secondBasketBall = new Basketball("Yellow", "Tim's");

        secondBasketBall.setCapacity(30);
        secondBasketBall.setBounceRate(5);


        Basketball thirdBasketBall = new Basketball("Red", "Jane's", 80);

        thirdBasketBall.setBounceRate(38);

        Basketball fourthBasketBall = new Basketball("Orange", "Adam's", 90, 75);


        Basketball fifthBasketBall = new Basketball();

        fifthBasketBall.setColor("Blue");
        fifthBasketBall.setOwner("John's");
        fifthBasketBall.setCapacity(30);
        fifthBasketBall.setBounceRate(5);


        firstBaseball.showBallData();
        secondBaseball.showBallData();
        thirdBaseball.showBallData();
        fourthBaseball.showBallData();
        fifthBaseball.showBallData();


        firstBasketBall.showBallData();
        secondBasketBall.showBallData();
        thirdBasketBall.showBallData();
        fourthBasketBall.showBallData();
        fifthBasketBall.showBallData();


    }
}
