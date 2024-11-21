package Array_Program_YoutTube_love_babber;

public class Sort_0_And_1 {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 1, 0, 1, 0, 0 ,0,1};
		sort(arr);
		for (int arr2 : arr) {
			System.out.println(arr2);
		}
	}

	private static void sort(int[] arr) {
		int i = 0;
		int j = arr.length - 1;

		while (i <= j) {
			if (arr[i] == 0 || arr[j] == 1) {
				if (arr[i] == 0)
					i++;
				else
					j--;
				continue;
			}
			arr[i] = 0;
			arr[j] = 1;
		}
	}
}
