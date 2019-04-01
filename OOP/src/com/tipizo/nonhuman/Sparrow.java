package com.tipizo.nonhuman;

public class Sparrow extends Bird implements Flyable{

    public Sparrow(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    public void fly() {
        System.out.println("Sparrow flying high...");
    }

    public void move() {
        System.out.println("Sparrow is flapping its wings...");
    }
}
