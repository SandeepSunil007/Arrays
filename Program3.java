package NewArrays;

import java.util.Arrays;
import java.util.Collections;

// Desending Order
public class Program3 {
	public static void main(String[] args) {

	 //  it won't work , Bacause int, collection works with wrapper objects
    //	   int arr1[] = { 19, 67, 34, 24, 13, 56, 76 };
   //		Arrays.sort(arr1, Collections.reverseOrder()); 
		
 //     Using Method
		
		Integer arr[] = { 19, 67, 34, 24, 13, 56, 76 };
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Reverse order of Array : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//logic	
		System.out.println("Comming from Logic");
		int arr1[] = { 19, 67, 34, 24, 13, 56, 76 };
		desendingOrder(arr1); // wrapper type reference won't work 
		for(int i = 0 ; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
	}
	
	
	public static void desendingOrder(int array[]) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] < array[j]) { // 19 < 67
					int temp = array[j]; // 67
					array[j] = array[i]; // 19
					array[i] = temp; // 67
				}
			}
		}
	}

}
