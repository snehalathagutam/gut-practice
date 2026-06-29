package com.june25;

public class ThirdLargestDistinct {
	
	static int findThirdLargestDistinct(int arr[]) {
		int first=arr[0];
		int second=arr[0];
		int third=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				third=second;
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second&&arr[i]!=first) {
				third=second;
				second=arr[i];
			}
			else if(arr[i]>third&&arr[i]!=first&&arr[i]!=second) {
				third=arr[i];
			}
		}
	
		
		return third;
	}

	public static void main(String[] args) {
		
		int arr[]= {10,0,4,45,99,88};
		System.out.println(findThirdLargestDistinct(arr));
		
	}

}
