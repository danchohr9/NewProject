package com.example.newproject;

import java.util.PriorityQueue;
import java.util.Queue;

public class Checkpoint {

    private String name;
    private Queue<Vehicle> priorityOfVehicles;

    public Checkpoint(String name) {
        this.name = name;
        this.priorityOfVehicles = new PriorityQueue<>();
    }

    public Checkpoint(String name, Queue<Vehicle> priorityOfVehicles) {
        this.name = name;
        this.priorityOfVehicles = priorityOfVehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Queue<Vehicle> getPriorityOfVehicles() {
        return priorityOfVehicles;
    }

    public void setPriorityOfVehicles(Queue<Vehicle> priorityOfVehicles) {
        this.priorityOfVehicles = priorityOfVehicles;
    }

    public void addVehicle(Vehicle vehicle){
        priorityOfVehicles.offer(vehicle);
    }

    public void displayVehicles(){
        if(priorityOfVehicles.isEmpty()){
            System.out.println("No vehicles added!");
        }else{
            for(Vehicle vehicle: priorityOfVehicles){
                System.out.println(vehicle);
            }
        }
    }

    @Override
    public String toString() {
        return "Checkpoint{" +
                "name='" + name + '\'' +
                ", priorityOfVehicles=" + priorityOfVehicles +
                '}';
    }
}
