package com.intro.utilizingjavadocs;

public class Main {
    public static void main(String[] args) {

        // StringBuilder class

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Hello");

        System.out.println(stringBuilder);

        stringBuilder.append(" Tim");

        System.out.println(stringBuilder);

        stringBuilder.append(" Mistake to be Deleted!");

        System.out.println(stringBuilder);

        stringBuilder.delete(12, 34);

        System.out.println(stringBuilder);



    }
}
