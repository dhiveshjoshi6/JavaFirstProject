package com.sapient.keyread;

import java.util.Scanner;

public class KeyRead_Line2Runner {

	public static void main(String[] args) {

		KeyRead_Line2 keyLine = new KeyRead_Line2();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value of n : ");
		int n = scanner.nextInt();
		int[] array = new int[n];

		System.out.println("Enter" + n + "numbers; ");

		for (int i = 0; i < n; i++) {
			{
				array[i] = scanner.nextInt();
			}

		}

		keyLine.readData(array);
		keyLine.displayData();

		keyLine.sort();
		keyLine.displayData();

		System.out.println("enter the value to search for in array:");
		int value = scanner.nextInt();

		keyLine.checkValue(array, value);
	}

}
