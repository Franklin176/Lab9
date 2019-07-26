package co.grandcircus;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		/*
		 * LinkedList is more efficient than an ArrayList when we need to add elements to the middle
		 * somewhere, because all java does it adjust the previous and next node references
		 * 
		 * LinkedList is not as efficient as 
		 */
		
		
		//Declaring an ArrayList without a type in <>
		// you will have to cast all elements to the type your expecting
		// because by default everything would be considered an object 
		LinkedList list1 = new LinkedList();
		
		//When we declare an ArrayList we should specify a type using <> 
		//The types that go inside of the <> are referred to as generics 
		// (these can be our primitive wrappers) The reference to the generics on the RHS is optional after 
		// Java 7
		//ArrayList is considered Dynamic Array, we can resize
		
		
		
		LinkedList<Integer> list2 = new LinkedList<>();
		System.out.println(list2);
		list2.add(345);
		list2.add(78);
		list2.add(7);
		list2.add(345);
		//Duplicates are 
		System.out.println(list2);
		
		//elements can be assigned to their primitive type automatically
		
		int elementFromList = list2.get(2);
		System.out.println(elementFromList);
		System.out.println(list2);
		
		Collections.sort(list2); 
		System.out.println(list2);
		
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		//Be careful about removing integers they will need to be cast to the integer type
		list2.remove(0);
		System.out.println(list2);
		
		//you can use the primitive type reference or the parent wrapper type 
		//java will auto convert
		// for (Integer num : list2) 
		
		int sum = 0;
		for (int num : list2) {
			sum += num;
		}
		System.out.println(sum);
		
		int location = list2.indexOf(345);
		System.out.println(location);
		
		if(list2.contains(345)) {
			System.out.println("You found 345!");
		} else {
			System.out.println("You suck!");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of cars: ");
		int numCars = scan.nextInt();
		
		LinkedList<String> cars = new LinkedList<>();
		
		for (int i = 0; i < numCars; i ++) {
			System.out.println("Car #" + (i+1) + ": ");
			String car = scan.next();
			cars.add(car);
		}
		System.out.println(cars);
		
		modifyCarList(cars);
		System.out.println(cars);
	}
	
	public static LinkedList<String> modifyCarList(LinkedList<String> list) {
		list.add("Mercedes");
		return list;
	}
 	

}
