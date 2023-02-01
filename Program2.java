package NewArrays;

import java.util.Arrays;

//    Assending Order
public class Program2 {
	public static void main(String[] args) {
		int arr[] = { 19, 67, 34, 24, 13, 56, 76 };
		
		// Three line are equals to from 17 line code
//		Arrays.sort(arr);
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println("Arr : "+ arr[i]);
//		}
		
		
		assendingOrder(arr);
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void assendingOrder(int n[]) {
		int temparary = 0;
		for(int i = 0; i < n.length; i++) {
			for(int j = i+1; j < n.length; j++) {
				if(n[i] > n[j]) { // 19 > 13
					temparary = n[i];
					n[i] = n[j];
					n[j] = temparary;
				}
			}
			
		}

	}
}
