package com.jul1;

public class SmallestElement {

	public static void main(String[] args) {

		int arr[] = { 12, 45, 67, 23, 89, 34 };
		int smallElement = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallElement) {
				smallElement = arr[i];
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Smallest Element:" + smallElement);

	}

}
