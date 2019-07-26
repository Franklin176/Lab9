package co.grandcircus;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/*
 * @Atiba Franklin
 */
public class Lab9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/*
		 * 1. Display welcome 2. Display items and prices 3. Prompt user for item from
		 * list 4. Get user input 5. Add to cart 6. Display item and prices 7. Prompt
		 * user to continues 8. Get user selection 9. End Loop? 10. Display cart 11.
		 * Display average
		 */
		System.out.println("Welcome to Tee's Fruit Market!");

		String[] fruits = { "apples", "bananas", "grapefruits", "honeydew", "pears", "strawberries", "grapes",
				"blueberries", "pinapples", "kiwis" };
		double[] prices = { 3.99, 6.99, 2.99, 4.99, 1.99, 5.99, 8.99, 8.50, 7.25, 10.99 };

		System.out.println(" ");
		System.out.printf("%-15s %-15s", "Item", "Price");
		System.out.println(" ");
		System.out.println("======================");
		for (int i = 0; i < fruits.length; i++) {
			System.out.printf("%-15.15s %s\n", fruits[i], " $" + prices[i]);
		}

	

		String choice1 = "yes";
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<Double> list2 = new ArrayList<>();
		
		Map<String, Double> items = new HashMap<>();

		items.put("apples", 3.99);
		items.put("bananas", 6.99);
		items.put("grapefruits", 2.99);
		items.put("honeydew", 4.99);
		items.put("pears", 1.99);
		items.put("strawberries", 5.99);
		items.put("grapes", 8.99);
		items.put("blueberries", 8.50);
		items.put("pineapples", 7.25);
		items.put("kiwis", 10.99);
		
		while (choice1.equalsIgnoreCase("yes")) {

			System.out.println(" ");
			String choice = Validator.getString(scan, "What item would you like to order?");

			choice.toLowerCase();
			
			
			
			if (items.containsKey(choice)) {
				System.out.println(" ");
			System.out.println("Adding " + choice + " to cart at " + items.get(choice));

			double score = items.get(choice);

			
			list1.add(choice);

			
			list2.add(score);
			System.out.println(" ");
			choice1 = Validator.getString(scan, "Would you like to order anything else (Yes/No)");
			}
			else {
				System.out.println(" ");
				System.out.println("Unknown item, Enter one from the above list, All lowercase");
			}
		
			
		 if	(choice1.equalsIgnoreCase("no")) {
			System.out.println("Thanks for your order! \nHere's what you got:");
			
			System.out.print(list1);
			System.out.println(" ");
			System.out.print(list2);
			System.out.println(" ");
			
			double sum = 0;
			for (Double num : list2) {
				sum += num;
			}
			
			double j = Collections.max(list2);
			double k = Collections.min(list2);
			double l = sum/(items.size()-1);
			
			System.out.println("Your Maximum and Minimum prices are " + j + "   " + k );
			System.out.println("Average price per item in order was " + l);
			 
			
		 }
		 
		 }
		scan.close();

	
	
    }	
	
	
}
