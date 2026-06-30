package com.june30Tuesday;

public class MovingZerosToEnd {

	public static void main(String[] args) {
		
		int arr[]= {0,1,0,3,12};
		int j=0;
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println("==================");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}
