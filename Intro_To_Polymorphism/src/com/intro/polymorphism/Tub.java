package com.intro.polymorphism;

public class Tub {
    private int size;
    private Bubble b;

    public Tub(int size){
        setSize(size);
        b = new Bubble();
        b.setColor("Blue");
        b.setRadius(20);
    }


    // Getters
    public int getSize() {
        return size;
    }

    public String getBubbleColor(){
        return b.getColor();
    }

    // Setters
    public void setSize(int size) {
        this.size = size;
    }

}
