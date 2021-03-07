package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stringarray = {"name1", "name2", "name3", "name4", "name5"};
		
		//2. print the third element in the array
		System.out.println(stringarray[2]);
		
		//3. set the third element to a different value
		stringarray[2] = "newname";
		
		//4. print the third element again
		System.out.println(stringarray[2]);
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < stringarray.length; i++) {
			System.out.println(stringarray[i]);
		}
		
		//6. make an array of 50 integers
		int[] intarray = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		
		for (int j = 0; j < intarray.length; j++) {
			intarray[j] = rand.nextInt(51);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int compare = intarray[0];
		
		for (int j = 0; j < intarray.length; j++) {
			if (compare >= intarray[j]) {
				compare = intarray[j];
			}
		}
		
		System.out.println(compare);
		
		//9 print the entire array to see if step 8 was correct
		System.out.println("step 9");
		for (int j = 0; j < intarray.length; j++) {
			System.out.println(intarray[j]);
		}
		
		//10. print the largest number in the array.
		for (int j = 0; j < intarray.length; j++) {
			if (compare <= intarray[j]) {
				compare = intarray[j];
			}
		}
		
		System.out.println("step 10");
		System.out.println(compare);
		
	}
}
