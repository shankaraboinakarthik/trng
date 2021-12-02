package com.sonata;

public class DuplivaluesARR{
	public static void main(String args[]) {
		int arr[] = {1,2,1,3,4,5,4,6,2};
		System.out.println("Duplicate values in an Array:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
					
			}
		}
	}

}