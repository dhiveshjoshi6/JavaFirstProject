package com.sapient.commandlineargument;

public class Command_Line1Runner {

	public static void main(String[] args) {
		Command_Line1 commandLine = new Command_Line1();

		commandLine.setData(45, 456, 456);
		commandLine.getData();

		int sum = commandLine.sumOfNumbers();
		System.out.println("Sum of the numbers is: " + sum);

		double averageofnumber = commandLine.avgOfNumbers();
		System.out.println("Average of the numbers is: " + averageofnumber);

		int bignumber = commandLine.bigOfNumbers();
		System.out.println("Biggest numbers is " + bignumber);

		int smallnumber = commandLine.smallOfNumbers();
		System.out.println("Smallest numbers is " + smallnumber);
	}

}
