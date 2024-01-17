package com.workintech.model.carcompany;

public class GasPoweredCar extends CarSkeleton{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @java.lang.Override
    public void startEngine() {
        System.out.println("Gas powered car " + getName() + " engine start .");
    }

    @java.lang.Override
    public void drive() {
        System.out.println("Gas powered car " + getName() + " starts driving .");
    }
}
