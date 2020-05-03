package com.sapient.keyread;

import java.util.Arrays;

public class KeyRead_Line2 {

	private int n;
	int[] array = new int[n];

	public void readData(int[] array) {
		this.array = array;
	}

	public void displayData() {
		for (int value : array) {
			System.out.print(value + " ");
		}
		System.out.println();

	}

	public void sort() {

		Arrays.sort(array);
	}

//Function return true if given element found in array 
	public static void checkValue(int[] array, int value) {

		boolean test = Arrays.asList(array).contains(value);

		// Print the result
		System.out.println("Is " + value + " present in the array: " + test);
	}

}
