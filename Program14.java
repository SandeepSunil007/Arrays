package NewArrays;

public class Program14 {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50, 60 }; // 40, 50, 60, 10, 20, 30

		int n;
		if (array.length % 2 == 0)
			n = array.length / 2;
		else
			n = (array.length / 2) + 1;

		for (int i = 0; i < array.length / 2; i++) {

			int t = array[i];
			array[i] = array[n + i];
			array[n + i] = t;

		}
		for (int i = 0; i < array.length; i++) 
		 { 
		 System.out.println (array[i]); 
		 }
	}

}
