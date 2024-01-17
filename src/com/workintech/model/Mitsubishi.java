package com.workintech.model;

import java.util.Objects;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public void startEngine(){
        System.out.println(getName() + "'s engine is starting . ");
    }

    @java.lang.Override
    public void accelerate() {
        System.out.println(getName() + " is accelerating .");
    }
    public void justMitsubishi() {
        System.out.println("Just Mitsubishi");
    }

    @java.lang.Override
    public void brake() {
        System.out.println(getName() + " is braking .");
    }
}
