package NewArrays;

// merge Two arrays
public class Program16 {
	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50 };
		System.out.println("length : " + arr1.length);
		int arr2[] = { 60, 70, 80, 90, 100 };
		int arr3[] = new int[arr1.length + arr2.length];
		System.out.println("Length : " + arr3.length);
		int j = 0;
		for (int i = 0; i < arr1.length; i++, j++) {
			arr3[j] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++, j++) {
			arr3[j] = arr2[i];
		}
		for (j = 0; j < arr3.length; j++) {
			System.out.println(arr3[j]);
		}
	}

}
