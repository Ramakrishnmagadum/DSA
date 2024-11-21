package Search_algorithm;

import java.util.Arrays;

public class Binary_Search {
	public static void main(String[] args) {
		int[] arr = { 5, 9, 11, 12, 13, 18 };
		System.out.println(Binary_Method(arr, 0, arr.length - 1, 8));

		int[] arr2 = new int[10];//it will intialize the 0 for all the index of an array
		for (int arrr : arr2) {
			System.out.print(arrr+" ");
		}
		System.out.println();
		Arrays.fill(arr2, 4);
		for (int arrr : arr2) {
			System.out.print(arrr+" ");

		}
		

	}

	private static int Binary_Method(int[] arr, int start, int end, int key) {
		int mid = (start + end) / 2;
		while (true) {
			if (end >= start) {
				if (key == arr[mid]) {
					return mid;
				} else if (key > arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
				mid = (start + end) / 2;
			} else {
				return -1;
			}
		}
	}
}
