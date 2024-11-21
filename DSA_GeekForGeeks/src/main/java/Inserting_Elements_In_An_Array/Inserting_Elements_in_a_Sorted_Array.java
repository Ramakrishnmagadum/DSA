package Inserting_Elements_In_An_Array;

public class Inserting_Elements_in_a_Sorted_Array {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 13, 17, 21, 26, 36 };

		int insert_value = 21;

		// By using Binary Search find the position of value then insert and shift the
		// other value
		insert_value(arr, insert_value);
		for(int arr2 : arr) {
			System.out.print(arr2+"  ");
		}
	}

	private static void insert_value(int[] arr, int insert_value) {
		int i=0;
		for( i=arr.length-1 ; (i>=0 && arr[i-1]>insert_value) ;i-- ) {
			System.out.println(arr[i]+" ");
			arr[i]=arr[i-1];
		}
		if(arr[arr.length-1]>insert_value)
		arr[i]=insert_value;
	}

	
}
