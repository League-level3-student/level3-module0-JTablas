package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] thing = {"one","two","three","four","five"};
		//2. print the third element in the array
		System.out.println(thing[2]);
		//3. set the third element to a different value
		thing [2] = ("tres");
		//4. print the third element again
		System.out.println(thing[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < thing.length; i++) {
			thing [i] = ("anything");
			System.out.println(thing [i]);
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		//7. make an array of 50 integers
		int [] numbers = new int [50];
		//8. use a for loop to make every value of the integer array a random number
		Random ran = new Random ();
		for (int i = 0; i < numbers.length; i++) {
			numbers [i]= ran.nextInt(100);
			
			System.out.println(numbers[i]);
		}
		int small = numbers[0];
		int large = numbers[0];
		//9. without printing the entire array, print only the smallest number on the array
		for (int j = 0; j < numbers.length; j++) {
			if(small > numbers[j]){
				small = numbers[j];	
			}
			if(large < numbers[j]){
				large = numbers[j];	
			}
		}
		
		System.out.println(small);
		//10 print the entire array to see if step 8 was correct
		
		//11. print the largest number in the array.
		System.out.println(large);
		//12. print only the last element in the array
		System.out.println(numbers[49]);
	}
	}
