package com.sapient.commandlineargument;

import java.util.ArrayList;

public class Command_Line1 {
	// declaration of arrayList
	private ArrayList<Integer> arrayOfNumbers = new ArrayList<Integer>();

	// setData(),getData()
	public void setData(int... numberAtIndex) {
		for (int value : numberAtIndex) {
			arrayOfNumbers.add(value);
		}

	}

	public void getData() {
		for (int value : arrayOfNumbers) {
			System.out.println(value + ' ');
		}

	}

//methods() like sumOfData(),avgOfData(),bigOfData()
	public int sumOfNumbers() {
		int sum = 0;
		for (int numberAtIndex : arrayOfNumbers) {
			sum += numberAtIndex;
		}
		return sum;
	}

	public double avgOfNumbers() {
		double avg = (double) sumOfNumbers() / arrayOfNumbers.size();
		return avg;
	}

	public int bigOfNumbers() {
		int max = Integer.MIN_VALUE;
		for (int numberAtIndex : arrayOfNumbers) {
			if (numberAtIndex > max) {
				max = numberAtIndex;
			}
		}
		return max;
	}

	public int smallOfNumbers() {
		int min = Integer.MAX_VALUE;
		for (int numberAtIndex : arrayOfNumbers) {
			if (numberAtIndex < min) {
				min = numberAtIndex;
			}
		}
		return min;
	}
}
