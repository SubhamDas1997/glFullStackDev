package floorConstruction.main;

import java.util.Scanner;
import floorConstruction.classes.ConstructionOrder;

public class Driver {

	public static void main(String[] args) {
		//Creating a new object of scanner class
		Scanner sc = new Scanner(System.in);
		//Creating a new object of created class
		ConstructionOrder floorCons = new ConstructionOrder();
		
		//Taking number of floors from the user
		System.out.println("Enter the total number of floors in the building: ");
		int noOfFloors = sc.nextInt();
		
		//Taking the floor sizes per day from the user using loop
		Integer[] floorSize = new Integer[noOfFloors];
		for(int i = 1; i <= noOfFloors; i++) {
			System.out.println("Enter the floor size given on day: " + i);
			floorSize[i-1] = sc.nextInt();
		}
		
		//Compairing the floor sizes and displaying appropriate output
		System.out.println("The order of construction is as follows: ");
		floorCons.orderOfConstruction(floorSize);
		
		sc.close();
	}
}