package com.sonata;

public class TwoLargeNumArr {
	public static void main (String[] args)
	{
		
 
		int arr[] = {4,25,99,56,35,71,16,88};
        
		int largest1, largest2, temp;
 
		largest1 = arr[0];
		largest2 = arr[1];
 
		if (largest1 < largest2)
		{
			temp = largest1;
			largest1 = largest2;
			largest2 = temp;
		}
 
		for (int i = 2; i < arr.length; i++)
		{
			if (arr[i] > largest1)
			{
				largest2 = largest1;
				largest1 = arr[i];
			}
			else if (arr[i] > largest2 && arr[i] != largest1)
			{
				largest2 = arr[i];
			}
		}
 
		System.out.println ("The First largest number is " + largest1);
		System.out.println ("The Second largest number is " + largest2);
 
	}

}

	
		
	