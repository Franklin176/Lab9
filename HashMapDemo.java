package co.grandcircus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// Maps are very efficient when retrieving data from memory
		
		Map<String, Double> items = new HashMap<>(); 
		items.put("Computer", 1699.99);
		items.put("Ipad", 4000.99);
		items.put("Calculator", 11.98);
		items.put("Television", 599.78);
		
		System.out.println(items);
		
		//Maps can't have duplicate keys, but can have duplicate values -- 
		// keys are unique
		//The elements may not always be in order
		
		items.put("Calculator", 6000.55);
		System.out.println(items);

		for(String key : items.keySet()) {
			System.out.println(key + " $" + items.get(key));
		}
		System.out.println(items.get("Television"));
		System.out.println(items.containsValue(599.78));
		System.out.println(items.containsKey("Computer"));
		
		//Maps can contain complex values
		HashMap<String, List<String>> classes = new HashMap<>();
		classes.put("Java", new ArrayList<>());
		classes.get("Java").add("Kiara");
		classes.get("Java").add("Ben");
		classes.get("Java").add("Tasha");
		classes.get("Java").add("Atiba");
		classes.put("Facebook Java", new LinkedList<>());
		classes.get("Facebook Java").add("Sienna");
		classes.get("Facebook Java").add("Stuart");
		classes.get("Facebook Java").add("Tia");
		
		System.out.println(classes);
		
		
	}

}
