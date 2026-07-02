package com.leader_and_alter_max_min_july2;

public class AlterMaxMinElements {

	static void arrangeMaxMin(int arr[]) {

		int left = 0;
		int right = arr.length - 1;

		boolean status = true;

		int arr1[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (status) {
				arr1[i] = arr[right--];
			} else {
				arr1[i] = arr[left++];
			}
			status = !status;
		}
		for (int a : arr1) {
			System.out.print(a + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		arrangeMaxMin(arr);

	}

}
