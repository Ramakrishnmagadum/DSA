package Inserting_Elements_In_An_Array;

public class Inserting_Elements_in_an_Array_at_the_End {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 12;
		arr[1] = 2;
		arr[2] = 8;
		// 3rd index values need to be insert
		int next = 3;
		int value = 44;
		int size = insertvalue(arr, next, value);
		printarray(arr, size);
	}

	private static void printarray(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static int insertvalue(int[] arr, int next_index, int value) {
		if (next_index < arr.length) {
			arr[next_index] = value;
			return next_index + 1;
		}
		return next_index;
	}
}
