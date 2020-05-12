package week4.sapient.arrayprogram;

import java.util.Arrays;

public class Int_Arr_Process 
{
	//a.	It is class to process a integer array.
	private int[] array;
	
	//i.	It should define a integer array of given size
	public Int_Arr_Process(int size) {
		array=new int[size];
	}
	
	//ii.	If the size is not give it should define  a array of 10
	public Int_Arr_Process()
	{
		array=new int[10];
	}
	//iii.	It should be able to adopt a given array
	public Int_Arr_Process(int size,int[] arr) {
		array=new int[size];
		for(int i=0;i<size;i++)
			array[i]=arr[i];
	}

	/*copy constructor:The copy constructor is a constructor which creates 
	an object by initializing it with an object of the same class, 
	which has been created previously.*/
	
	public Int_Arr_Process(Int_Arr_Process ob) {
		//this.array= ob.array.clone();
		this.array=new int[ob.array.length];
		for(int i=0; i<ob.array.length; i++)
			this.array[i]=ob.array[i];
		
	}
	void readArray(int[] value)
	{
		for(int i=0; i<array.length; i++)
			array[i]=value[i];
	}
	void displayHorizontally()
	{
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
		System.out.print("\n");
	}
	void displayVertically()
	{
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
	}
	
	int biggestNumber()
	{
		int max=Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++)
		{
			if(array[i]>max)
				max=array[i];
		}
		return max;
	}
	int smallestNumber()
	{
		int min=Integer.MAX_VALUE;
		for(int i=0; i<array.length; i++)
		{
			if(array[i]<min)
				min=array[i];
		}
		return min;
	}
	int sumOfElements() 
	{
		int sum=0;
		for(int i=0; i<array.length; i++)
			sum+=array[i];
		return sum;
	}
	
	void sortArray()
	{
		Arrays.sort(array);
	}
	
	int secondBiggest()
	{
		sortArray();
		int size=array.length;
		return array[size-2];
	}
}
