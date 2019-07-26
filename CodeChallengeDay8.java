package co.grandcircus;

public class CodeChallengeDay8 {

	

		public static void main(String[] args) {

			// Code Challenge 1: sum the values of the array
			double[] prices = { 1.0, 2.0, 3.0, 4.0 };

		int sum = 0;
		for(double num : prices) {
			sum += num;
			
		}
		System.out.println(" Challenge 1 result:" + sum);
		
			
			// Code Challenge 2: sum the diagonal of a 2D array = 18
			int[][] arr2 = { { 3, 4, 5, 6 }, 
							{ 6, 7, 8, 9 }, 
							{ 2, 3, 4, 5 }, 
							{ 7, 6, 5, 4 } };

			int sum2= 0;
			for(int i = 0; i < arr2.length; i++) {
				sum2 += arr2[i][i];
				
			}
		System.out.println("Challenge 2 result: " + sum2);
			
			
			
			// Code Challenge 3: sum the reverse diagonal of the 2D array above = 24
			int sum3 = 0;
			for(int i = 0; i < arr2.length; i++) {
				for(int j = arr2.length -1; j > - 1; j--) {
					if(i + j == arr2.length -1) {
						
						sum3 += arr2[i][j];
					}
				}
			}
			System.out.println("Challenge 3 result: " + sum3);
		}

	}