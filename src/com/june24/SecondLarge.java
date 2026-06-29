package com.june24;

public class SecondLarge {
	
	static int findSecondLarge(int arr[]) {
		
		int large=arr[0];
		int slarge=arr[1];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				slarge=large;
				large=arr[i];
			}
			else if(arr[i]<large && arr[i]>slarge) {
				slarge=arr[i];
			}
		}
		
		return slarge;
	}

	public static void main(String[] args) {
		
		int arr[]= {10,88,4,7,22};
		
		
		int slarge=findSecondLarge(arr);
		System.out.println("Seconda large:"+slarge);
		

	}

}
