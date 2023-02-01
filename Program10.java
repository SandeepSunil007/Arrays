package NewArrays;

public class Program10 {
	public static void main(String[] args) {
		int[] arr = { 60, 70, 80, 10, 20, 30, 40, 50, 90, 100 };
		int firstBig = arr[0];
		int secondBig = arr[1];

		for (int i = 0; i < arr.length; i++) {
			if (firstBig < arr[i]) {
				secondBig = firstBig;
				firstBig = arr[i];
			}
		}
		int sum = firstBig + secondBig; // Highest 
		System.out.println("sum : " + sum);
		System.out.println("firstBig : " + firstBig);
		System.out.println("secondBig : " + secondBig);

	}
}
