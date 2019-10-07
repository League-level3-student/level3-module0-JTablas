package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] something = {"one","two","three","four","five","six","seven","eight"};
		 stringed(something);
		 back(something);
		 other(something);
		rando(something);
	}

	// 2. Write a method that takes an array of Strings and prints all the
	// Strings in the array.
	static void stringed(String []string) {
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the
	// Strings in the array
	// in reverse order.

	static void back(String []bac) {
		for (int o = bac.length-1; o > 0; o--) {
			System.out.println(bac[o]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static void other(String []oth) {
		for (int p = 0; p < oth.length; p++) {
			if (p % 2 == 0) {
				System.out.println(oth[p]);
			}
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the
	// Strings in the array
	// in a completely random order. Almost every run of the program should
	// result in a different order.

	static void rando(String []ra) {

		String[] rara = { "", "", "", "", "", "", "", "", };
		int wordsp = 0;
		Random ran = new Random();
		
		while (wordsp < ra.length) {
			boolean alreadyprint = false;
			String newword = ra[ran.nextInt(ra.length)];

			for (int u = 0; u < wordsp; u++) {
				if (newword.equals(rara[u])) {
					alreadyprint = true;
					break;
				}
			}
			if(alreadyprint==false){
				System.out.println(newword);
				rara[wordsp]=newword;
				wordsp+=1;
			}

		}
	}

}
