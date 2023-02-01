package NewArrays;

// Palindrome Number in the given array
public class Program18 {
	public static void main(String[] args) {
		int ar[] = { 232, 12, 78, 898, 34543, 45 };
		int paliCount = 0;
		int nonPaliCount = 0;
		int index = 2;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == arrayPalindrom(ar[i])) {
				paliCount++;
				if (paliCount == index) {
					System.out.println("second palindrome number : " + ar[i]+" and index is : "+ i);
				}
			} else {
				nonPaliCount++;
			}
		}
		System.out.println("pali count : " + paliCount);
		System.out.println("non pali count : " + nonPaliCount);
	}

	public static int arrayPalindrom(int n) {
		int reminder;
		int store = 0;
		while (n > 0) {
			reminder = n % 10;
			store = store * 10 + reminder;
			n = n / 10;
		}
		// System.out.println("store : "+ store);
		return store;
	}

}
