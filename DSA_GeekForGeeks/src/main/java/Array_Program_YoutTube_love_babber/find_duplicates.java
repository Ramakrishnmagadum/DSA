package Array_Program_YoutTube_love_babber;

public class find_duplicates {
//	Example
//	input : 1 , 2 , 3, 2, 4
//	output : 2 is repeating
//	Explanation : Elements are present from 1 to N-1 and one value is repaeting twice , find that value
//	
//	input : 1,2,4,3,5,7,6,5 ,8,9
//	output : 5
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 3, 5, 7, 6, 8, 10, 9};
		System.out.println(duplicate1(arr));
		System.out.println(duplicate2(arr));
	}

	private static int duplicate2(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		for(int i=1;i<arr.length;i++) {
			ans=ans^i;
		}
		return ans;
	}

	private static int duplicate1(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans += arr[i];
		}
		int ans2 = (arr.length * (arr.length - 1)) / 2;
		
		return ans - ans2;

	}
}
