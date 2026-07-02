package com.leader_and_alter_max_min_july2;

public class LeaderElement {

	static void leaderElement(int arr[]) {

		int leader = arr[arr.length - 1];

		System.out.print(leader + " ");

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > leader) {
				leader = arr[i];
				System.out.print(leader + " ");
			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 16, 17, 4, 3, 5, 2 };

		leaderElement(arr);

	}

}
