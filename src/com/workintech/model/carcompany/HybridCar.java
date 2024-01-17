package com.workintech.model.carcompany;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders ;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }




    @java.lang.Override
    public void drive() {
        System.out.println(getName() + " hybrid car drives .");
        runEngine();
    }
}
