package com.workintech.model;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    public void startEngine(){
        System.out.println(getName() + "'s engine is starting . ");
    }

    @java.lang.Override
    public void accelerate() {
        System.out.println(getName() + " is accelerating .");
    }

    @java.lang.Override
    public void brake() {
        System.out.println(getName() + " is braking .");
    }
}
