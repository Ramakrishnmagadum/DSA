package Array_Program_YoutTube_love_babber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class find_all_duplicates_leetCode_442 {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> list = duplicate_numbers(arr);
		for (int list2 : list)
			System.out.println(list2);

		List<Integer> list2 = duplicate_numbers_Method2(arr);
		for (int list3 : list2)
			System.out.println(list3);
	}

	private static List<Integer> duplicate_numbers_Method2(int[] arr) {
		int[] freq = new int[arr.length + 1];
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 1)
				list.add(i);
		}
		return list;
	}

	private static List<Integer> duplicate_numbers(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		for (int key : map.keySet()) {
			if (map.get(key) > 1)
				list.add(key);
		}
		return list;
	}

}
