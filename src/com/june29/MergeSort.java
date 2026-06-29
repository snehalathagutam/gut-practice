package com.june29;

public class MergeSort {
	
	static void divide(int arr[]) {
		
		if(arr.length<=1)
			return;
		int left[]=new int [arr.length/2];
		int right[]=new int [arr.length-left.length];
		
		int i=0;
		for(i=0;i<left.length;i++) {
			left[i]=arr[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=arr[i++];
		}
		divide(left);
		divide(right);
		
		mergeSort(left,right,arr);
	}

	static void mergeSort(int left[],int right[],int arr[]) {
		int i=0;
		int j=0;
		int k=0;
		
		while(i<left.length&&j<right.length) {
			if(left[i]<right[j]) {
				arr[k++]=left[i++];
			}
			else{
				arr[k++]=right[j++];
			}
		}
		while(i<left.length) {
			arr[k++]=left[i++];
		}
		while(j<right.length) {
			arr[k++]=right[j++];
		}
		
	}
	public static void main(String[] args) {
		
		int arr[]= {38,27,43,3,9,82,10};
		divide(arr);
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("=====================");
		

	}
	

}
