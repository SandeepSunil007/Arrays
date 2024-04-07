package NewArrays;

import java.util.Scanner;

// prefere to use in array always starts with i = 0 and i < array.length
public class BaseCode {
	public static void main(String[] args) {
		System.err.println("Hello Java");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scan.nextInt();

		int[] myArray = new int[num];
		System.out.println("Enter " + num + " values : ");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = scan.nextInt();
		}
		System.out.println("printing the user entered numbers : ");
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
}
