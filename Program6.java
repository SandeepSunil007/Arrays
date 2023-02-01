package NewArrays;

//insert an element in specified location

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 60 }; // missed 50 at 4th posistion
		System.out.println("Normal Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println();
		System.out.println("Enter Element, which Element you want to insert : ");
		int element = scan.nextInt();
		System.out.println("Mention which position your elemet should present : ");
		int position = scan.nextInt();

		arr = insertElement(arr, element, position);

		System.out.println("Prinnting new array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static int[] insertElement(int[] arr, int element, int position) {
		if (0 < position && position > arr.length) {
			System.out.println(element + " insertion not posible ");
		}
		int[] newArray = new int[arr.length + 1];
		newArray[position] = element;
		for (int i = 0; i < arr.length; i++) {
			if (i < position) {
				newArray[i] = arr[i];
			} else {
				newArray[i + 1] = arr[i];
			}
		}
		return newArray;
	}
}
