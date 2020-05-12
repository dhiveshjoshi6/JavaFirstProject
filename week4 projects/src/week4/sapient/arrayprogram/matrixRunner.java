package week4.sapient.arrayprogram;

import java.util.Scanner;

public class matrixRunner {

	public static void main(String[] args) 
	{
		

			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the size of the matrix n, m: ");

			int n = scan.nextInt();
			int m = scan.nextInt();

			matrix matrixObj1 = new matrix(n, m);
			matrixObj1.operationsOnArray(matrixObj1);

			matrix matrixObj2 = new matrix();
			matrixObj2.operationsOnArray(matrixObj2);

			matrix matrixObj3 = new matrix(matrixObj1);
			matrixObj3.operationsOnArray(matrixObj3);

			scan.close();
	}
	}
