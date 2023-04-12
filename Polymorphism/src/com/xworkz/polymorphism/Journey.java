package com.xworkz.polymorphism;

public class Journey {
	
	public static void main(String[] args) {
		Vehicle veh= new Vehicle();
		veh.ride();
		veh.travel();
		veh.consume();
		
		Car car= new Car();
		car.ride();
		car.travel();
		car.consume();
		
		Bike bike = new Bike();
		bike.ride();
		bike.travel();
		bike.consume();
		
		Truck truck= new Truck();
		truck.ride();
		truck.travel();
		truck.consume();
		
		Cycle cyc= new Cycle();
		cyc.ride();
		cyc.travel();
		cyc.consume();
		
		Auto auto = new Auto();
		auto.ride();
		auto.travel();
		auto.consume();
	}

}
