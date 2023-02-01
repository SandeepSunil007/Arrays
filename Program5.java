package NewArrays;
 // print Even, sum, count
public class Program5 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sum = sum + array[i];
				count++;
				System.out.println(array[i]);
			}
		}
		System.out.println("count : " + count);
		System.out.println("sum : " + sum);
	}

}
