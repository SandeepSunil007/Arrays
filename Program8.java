package NewArrays;
import java.util.Scanner;

// User Element present into array or Not

public class Program8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter , Which number you want to search : ");
		int element = scan.nextInt();
		
		int[] array = {1,2,4,43,89,86,90};
		boolean searchElement = searchElement(array, element);
		if(searchElement) {
			System.out.println(element+" present onto array");
		}else {
			System.out.println(element+" not present onto array");
		}
		
	}

	private static boolean searchElement(int[] array, int element) {
		boolean flag = false;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == element) {
    //	System.out.println(element+" present into "+ i+" posistion");
				flag= true;
				break;
			}
		}
		return flag;
		
	}

}
