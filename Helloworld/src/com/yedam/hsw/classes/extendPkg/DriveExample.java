package com.yedam.hsw.classes.extendPkg;

public class DriveExample {

	public static void main(String[] args) {
		Driver d1 = new Driver();
		Vehicle vehicle = new Vehicle();
		d1.drive(vehicle);
		vehicle = new Bus(); // Promotion
		d1.drive(vehicle);
		vehicle = new Truck();
		d1.drive(vehicle);

	}

}
