package com.example.newproject;


import java.util.Comparator;

public class Vehicle implements Comparable<Vehicle>{

    private double weight;
    private boolean isEmergencyVehicle;


    public Vehicle(double weight, boolean isEmergencyVehicle) {
        this.weight = weight;
        this.isEmergencyVehicle = isEmergencyVehicle;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isEmergencyVehicle() {
        return isEmergencyVehicle;
    }

    public void setEmergencyVehicle(boolean emergencyVehicle) {
        isEmergencyVehicle = emergencyVehicle;
    }

    @Override
    public int compareTo(Vehicle vehicle) {
        return Boolean.compare(this.isEmergencyVehicle, vehicle.isEmergencyVehicle);
    }

    public static Comparator<Vehicle> ComparatorByVehicleType = new Comparator<Vehicle>() {
        @Override
        public int compare(Vehicle vehicle1, Vehicle vehicle2) {
            return Boolean.compare(vehicle1.isEmergencyVehicle, vehicle2.isEmergencyVehicle);
        }
    };

    public static Comparator<Vehicle> ComparatorByVehicleWeight = new Comparator<Vehicle>() {
        @Override
        public int compare(Vehicle vehicle1, Vehicle vehicle2) {
            return Double.compare(vehicle1.weight, vehicle2.weight);
        }
    };

    @Override
    public String toString() {
        return "Vehicle{" +
                "weight=" + weight +
                ", isEmergencyVehicle=" + isEmergencyVehicle +
                '}';
    }

}
