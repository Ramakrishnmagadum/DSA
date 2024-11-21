package Array_Program_YoutTube_love_babber;

public class Reverse_Array {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		reverse_array(arr, 0, arr.length - 1);
		for (int arr2 : arr) {
			System.out.print(arr2 + " ");
		}
	}
	private static void reverse_array(int[] arr, int start, int end) {
		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
