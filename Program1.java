package NewArrays;

import java.util.Scanner;

// min and max values in Existing array
public class Program1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = scan.nextInt();

		int[] myArray = new int[num];
		System.out.println("Enter " + num + " values : ");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = scan.nextInt();
		}
		System.out.println("User Entered Numbers : ");
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

		System.out.println("printinng lowest value in the array : ");

		int min = myArray[0];
		for (int i = 0; i < myArray.length; i++) {
			if (min > myArray[i]) {
				min = myArray[i];
			}
		}
		System.out.println("min value : " + min);

		System.out.println("print the maximum of element in the array :  ");
		int max = myArray[0]; // 2,5,1,5,6,9
		for (int i = 0; i < myArray.length; i++) {
			if (max < myArray[i]) {
				max = myArray[i];
			}
		}
		System.out.println("maximum value : " + max);
	}

}
