package week4.sapient.arrayprogram;

public class Int_Arr_ProcessRunner {

	public static void main(String[] args) 
	{
		Int_Arr_Process object =new Int_Arr_Process(6);
		
		object.readArray(new int[]{1,12,13,12,34,12});
		
		object.displayVertically();
		object.displayHorizontally();
		
		System.out.println("The biggest element is:"+object.biggestNumber());
		System.out.println("The smallest element is:"+object.smallestNumber());
		System.out.println("The sum of all elements is:"+object.sumOfElements());
		object.sortArray();
		System.out.println("array after sorting:");
		object.displayHorizontally();
		System.out.println("The second biggest element is:"+object.secondBiggest());
		
	}

}
