package com.sapient.shapes;

public class Shapes {
//instance variable
	int numberOfSides;

	// method() inside class shapes

	public void calculateShapeArea(int numberOfSides, int sideLength) {
		this.numberOfSides = numberOfSides;

		if (numberOfSides == 1) {
			double area = (3.14 * sideLength * sideLength);
			System.out.println("area of circle is:" + area);
		} else if (numberOfSides == 3)

		{
			double area = (0.433 * sideLength * sideLength);
			System.out.println("area of triangle is:" + area);
		}

		else if (numberOfSides == 4)

		{
			int area = (sideLength * sideLength);
			System.out.println("area of square is:" + area);
		} else if (numberOfSides > 4)

		{

			System.out.println("no shapes present");
		}
	}
}
