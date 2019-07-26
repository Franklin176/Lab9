package co.grandcircus;
/*
 * @Atiba Franklin
 */

import java.util.Arrays;

public class Array2dDemo {

	public static void main(String[] args) {
		//Initialize a 2D Array with 3 rows and 3 columns (rectangular array)
		
		int[][] arr = new int [3][3];
		
		//to refer to a location we still need to use the [] notation
		arr[1][2] = 67;
		
		System.out.println(Arrays.toString(arr));
		
		int[][] arr2 = {{1,2,3}, 
						{4,5,6},
						{7,8,9}};
		
		//This is looping through the rows
		for(int i = 0; i < arr2.length; i++) {
			//System.out.println(Arrays.toString(arr2[i]));
			//The nested for loop is looping through the columns
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.println(i + "," + j + " = " + arr2[i][j]);
				
			}
		}
		int sum = 0;
		for(int[] row : arr2) {
			for(int column : row) {
				sum += column;
			}
		}
		System.out.println(sum);
		//This is also considered a rectangular array
		//They can have an unequal amount of rows and column but the 
		//column size is always declared when created
		String[][] names = new String[4][12];
		names[1][1] = "Brian";
		
		System.out.println(names[1][1]);
		
		// Jagged array example -- it will have rows that may have an unequal amountof columns
		String[][] movies = new String[3][];
		movies[0] = new String[3];	//This is crating the rows for the first index
		movies[1] = new String[5];
		movies[2] = new String[1];
		
		movies[0][1] = "Dumb & Dumber";
		
		String[][] movies2 = {{"Forgetting Sarah Marshall", "Dumb & Dumber", "Friday"},
				{"Titanic", "Schindlers List"},
				{"Scarface"}};
		
		}
		
		
	}
	

