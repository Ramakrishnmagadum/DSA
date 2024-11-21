package Inserting_Elements_In_An_Array;

public class Inserting_Elements_in_an_Array_at_any_Position {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 12;
		arr[1] = 2;
		arr[2] = 8;
		arr[3] = 121;
		arr[4] = 77;
		// 3rd index values need to be insert
		int position = 1;
		int value = 44;
		int size = insertvalue(arr, position, value);
		printarray(arr, size);
	}

	private static int insertvalue(int[] arr, int position, int value) {
		for (int i = arr.length - 2; i >= position; i--) {
			arr[i + 1] = arr[i];
		}
		arr[position] = value;
		return arr.length;
	}

	private static void printarray(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
