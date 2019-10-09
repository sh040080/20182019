package com.exam05;

public class Ch08_Exam05 {

	public static void main(String[] args) {
Airplane ap = new Airplane("L747", 1000);
Cargoplane cp = new Cargoplane("C40",1000);

System.out.println("Plane FuelSize \n ---------------");
System.out.println(ap.getPlaneName() + "\t\t" + ap.getFuelSize());
System.out.println(cp.getPlaneName() + "\t\t" + cp.getFuelSize()+"\n");

System.out.println("100 운항");
System.out.println("Plane FuelSize \n ---------------");
ap.flight(100);
cp.flight(100);

System.out.println("200 주유");
System.out.println("Plane FuelSize \n ---------------");
ap.refuel(200);
cp.refuel(200);

	}

}
