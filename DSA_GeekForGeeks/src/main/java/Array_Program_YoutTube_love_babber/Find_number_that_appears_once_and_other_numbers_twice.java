package Array_Program_YoutTube_love_babber;

public class Find_number_that_appears_once_and_other_numbers_twice {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 4, 1 };
		int[] arr2 = { 2, 4, 4, 5, 6, 5, 2 };

		System.out.println(find(arr));
		System.out.println(find(arr2));
	}

	private static int find(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}
}
