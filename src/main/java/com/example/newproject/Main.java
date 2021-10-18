package com.example.newproject;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

    //TASK 1

	Vehicle truck1 = new Vehicle(100.50, true);
	Vehicle truck2 = new Vehicle(67.70, false);
	Vehicle car1 = new Vehicle(70.50, true);
	Vehicle car2 = new Vehicle(205.80, false);
	Vehicle car3 = new Vehicle(87.0, true);

//	Checkpoint checkpoint = new Checkpoint("Checkpoint");
//
//	checkpoint.addVehicle(truck1);
//	checkpoint.addVehicle(truck2);
//	checkpoint.addVehicle(car1);
//	checkpoint.addVehicle(car2);
//	checkpoint.addVehicle(car3);
//
//	checkpoint.displayVehicles();

	Queue <Vehicle> priorityQueue = new PriorityQueue<>
		(Vehicle.ComparatorByVehicleType.thenComparing(Vehicle.ComparatorByVehicleWeight).reversed());

	priorityQueue.add(truck1);
	priorityQueue.add(truck2);
	priorityQueue.add(car1);
	priorityQueue.add(car2);
	priorityQueue.add(car3);

	Checkpoint checkpoint1 = new Checkpoint("Checkpoint 1", priorityQueue);

	checkpoint1.displayVehicles();

	System.out.println();

	//TASK 2

	PlasticGoods good1 = new PlasticGoods("bottle", 23.5);
	PlasticGoods good2 = new PlasticGoods("bottle", 534.0);
	PlasticGoods good3 = new PlasticGoods("bottle", 13.0);
	PlasticGoods good4 = new PlasticGoods("bottle", 11.0);
	PlasticGoods good5 = new PlasticGoods("bottle", 183.0);
	PlasticGoods good6 = new PlasticGoods("bottle", 64.0);
	PlasticGoods good7 = new PlasticGoods("bottle", 72.0);
	PlasticGoods good8 = new PlasticGoods("bottle", 37.0);

	TreeSet<PlasticGoods> treeSet = new TreeSet<>(PlasticGoods.ComparatorByPrice);

	treeSet.add(good1);
	treeSet.add(good2);
	treeSet.add(good3);
	treeSet.add(good4);
	treeSet.add(good5);
	treeSet.add(good6);
	treeSet.add(good7);
	treeSet.add(good8);


	PlasticGoodsManufacturer plasticGoodsManufacturer = new PlasticGoodsManufacturer("PGM", treeSet);

	System.out.println("ALL PLASTIC GOODS:");
	plasticGoodsManufacturer.displayPlasticGoods();

	System.out.println("Average plastic goods price is:" + plasticGoodsManufacturer.averagePlasticGoodPrice());

	System.out.println("The product closes to the average products' price is:" + plasticGoodsManufacturer.closestToAverage());

//	System.out.println(plasticGoodsManufacturer.averagePlasticGoodPrice());
//
//		System.out.println(plasticGoodsManufacturer.averageElement());


    }
}
