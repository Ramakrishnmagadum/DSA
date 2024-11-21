package Array_Program_YoutTube_love_babber;

import java.util.ArrayList;
import java.util.List;

public class Intersection_of_Two_Array {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3,3,3, 4, 6, 7, 12};
		int[] arr2 = { 2,3,3, 4, 6, 9, 10, 11 };

		List<Integer> list = method1(arr, arr2);
		for (int list2 : list) {
			System.out.println(list2);
		}
		
		
	}

	

	private static List<Integer> method1(int[] arr, int[] arr2) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0, j = 0; (i < arr.length && j < arr2.length);) {
			if (arr[i] == arr2[j]) {
				list.add(arr[i]);
				i++;
				j++;
			} else if (arr[i] > arr2[j]) {
				j++;
			} else {
				i++;
			}
		}
		return list;
	}
}
