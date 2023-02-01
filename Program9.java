package NewArrays;

import java.util.Scanner;

// User Element present in which Index, count and Specified occurance index return
public class Program9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user number");
		int element = scan.nextInt();
		int[] arr = { 10, 20, 30, 10, 40, 10 };
		boolean searchElement = searchElement(arr, element);
		if (!searchElement) {
			System.out.println(element + " is not present into existing array : ");
		} else {
			int count = 0;
			System.out.println("Enter which index you want see your entered number  : ");
			int repeatIndex = scan.nextInt();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == element) {
					count++;
					if (count == repeatIndex) {
						System.out.println(element + " element present in " + count + " time index " + i);
					}
				}
			}
			if (count == 1 && repeatIndex >= 1) {
				System.out.println(repeatIndex + "nd time not availabe " + element + " element");
				searchElement(arr, element);
			} else {
				System.out.println(element + " Number element count present in existing array : " + count);
			}
		}
	}

	private static boolean searchElement(int[] arr, int element) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				// System.out.println(element + " number present only one time, in " + i + "th
				// index ");
				flag = true;
			}
		}
		return flag;
	}
}
