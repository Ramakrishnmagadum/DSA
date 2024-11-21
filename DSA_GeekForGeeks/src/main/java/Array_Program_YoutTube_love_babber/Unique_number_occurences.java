package Array_Program_YoutTube_love_babber;

import java.util.HashMap;
import java.util.TreeSet;

public class Unique_number_occurences {
//Example 1:
//intput =1,2,2,1,1,3
//output : true 
//Explanation : 1 = 3 times present
//              2 = 2 times present
//              3 = 1 times present
//	         its having unique occurance ......

//Example 2:
//	input : 1 ,2
//	output: false 
//	Explanation : 1 is present 1 times
//	              2   = 1 times
//	              both values are presernce one one times ...so unique occurance is not thier......

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 1, 1, 3 ,4,4,4,4};
		System.out.println(check_occurences(arr));
	}

	private static boolean check_occurences(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int key : map.keySet()) {
			set.add(map.get(key));
		}

		if (set.size() == map.size())
			return true;
		else
			return false;

	}
}
