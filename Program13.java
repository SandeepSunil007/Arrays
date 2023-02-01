package NewArrays;

public class Program13 {
	public static void main(String[] args) {
		int arr1[] = { 12, 13, 23, 15, 11, 16 };
		int arr2[] = { 53, 26, 23, 15, 18, 13 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					// break; // Not needed
				}
			}
		}
	}
}
