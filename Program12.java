package NewArrays;

// Highest Contiguous Sum // i should work on this later
public class Program12 {
	public static void main(String[] args) {
		int ar[] = { 21, 12, 15, 32, 16, 17, 22 };
		int inx = 0;
		int big = ar[0] + ar[1]; // 33
		for (int i = 0; i < ar.length - 1; i++) {
			if (big < ar[i] + ar[i + 1]) {
				big = ar[i] + ar[i + 1];
				inx = i;
			}
		}
		System.out.println("sum of two element" + "----->" + big);
		System.out.println("the first element" + "--->" + ar[inx]);
		System.out.println(" the second element" + "--->" + ar[inx + 1]);
	}

}
