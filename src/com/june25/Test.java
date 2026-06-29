package com.june25;

import java.util.Arrays;

public class Test {
	
	
	public static void main(String[] args) {
		
		int arr[]= {8,93,5,1,6};
		int m1=arr[0];
		int m2=arr[0];
		int m3=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>m1) {
				m3=m2;
				m2=m1;
				m1=arr[i];
			}
			else if(arr[i]>m2 && arr[i]!=m1) {
				m3=m2;
				m2=arr[i];
			}
			else if(arr[i]>m3&& arr[i]!=m2&&arr[i]!=m1)
				m3=arr[i];
		}
		
		System.out.println(m3);
	}

}
