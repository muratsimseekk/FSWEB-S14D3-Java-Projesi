package com.workintech.model;

import java.util.Objects;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        System.out.println("The car's engine is starting .");
    }
    public void accelerate() {
        System.out.println("The car is accelerating . ");
    }
    public void brake() {
        System.out.println("The car is braking .");
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Car car)) return false;
        if (!super.equals(object)) return false;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @java.lang.Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
