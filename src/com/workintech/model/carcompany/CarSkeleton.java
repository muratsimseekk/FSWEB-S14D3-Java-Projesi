package com.workintech.model.carcompany;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine() {

    }
    public void drive() {
        runEngine();
    }
    protected void runEngine() {
        System.out.println(getName() + " runs engine");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
