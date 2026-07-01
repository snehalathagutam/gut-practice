package com.jul1;

import java.util.Arrays;

public class ArraySortedOrNot {

	static boolean sortedArray(int arr[]) {
		boolean status = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				status = false;
			}
		}
		return status;
	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60 };
		if (sortedArray(arr)) {
			System.out.println("Array is Sorted" + Arrays.toString(arr));

		} else {
			System.out.println("Array is not sorted:" + Arrays.toString(arr));
		}

	}

}
