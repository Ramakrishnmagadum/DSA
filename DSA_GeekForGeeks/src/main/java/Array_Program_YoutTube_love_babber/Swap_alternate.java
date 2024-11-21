package Array_Program_YoutTube_love_babber;

public class Swap_alternate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		swap_alternate_method(arr);
		for (int arr2 : arr) {
			System.out.print(arr2 + " ");
		}
	}

	private static void swap_alternate_method(int[] arr) {
		int start = 0;
		int size = arr.length % 2 == 0 ? arr.length : arr.length - 1;
		while (start < size) {
			int temp = arr[start];
			arr[start] = arr[start + 1];
			arr[start + 1] = temp;
			start += 2;
		}
	}
}
