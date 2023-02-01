package NewArrays;

import java.util.Scanner;

// Deleting particular Element
public class Program7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50, 60, 60, 70, 80 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]" + "=" + arr[i]);
		}

		System.out.println("Enter which position Element you want to remove : ");
		int position = scan.nextInt();
		
	     arr = removeElement(arr,position);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static int[] removeElement(int[] array, int position) {
		if (0 < position && position > array.length) {
			System.out.println(position + " not posiable to remove");
		}System.out.println("array:"+array.length);
		int[] newArray = new int[array.length - 1];
		
		for (int i = 0; i < newArray.length; i++) {
			if(i < position) {
				newArray[i] = array[i];
			}else {
				newArray[i] = array[i+1];
			}
		}
		return newArray;

	}

}
