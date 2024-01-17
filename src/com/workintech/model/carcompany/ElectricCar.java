package com.workintech.model.carcompany;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @java.lang.Override
    public void startEngine() {
        System.out.println(getName() +" electrical car engine stars .");
    }


}
