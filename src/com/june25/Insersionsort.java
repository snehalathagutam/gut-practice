package com.june25;

import java.util.Arrays;

public class Insersionsort {
	
	public static void main(String[] args) {
		 
		int a[]= {12,11,13,5,6};

		for(int i=1;i<a.length;i++) {
			int j=i;
			int temp=a[i];
			
			while(j>0&&a[j-1]>temp) {
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
