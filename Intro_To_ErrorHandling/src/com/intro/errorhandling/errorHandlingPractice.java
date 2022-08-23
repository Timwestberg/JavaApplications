package com.intro.errorhandling;

public class errorHandlingPractice {

    public static void main(String[] args) {
        int number[] = {4, 8, 16, 32, 64,128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for( int i = 0; i < number.length; i++){
            try {

                System.out.println(number[i] + "/" + denom[i] + " is " + number[i]/denom[i]);

            } catch (ArithmeticException e){

                System.out.println("Can't Divide by Zero");

            } catch (ArrayIndexOutOfBoundsException e){

                System.out.println(" No matching element found");
            } finally {
                // Will always run!
                System.out.print("Application is still running...");
            }
        }
    }

}
