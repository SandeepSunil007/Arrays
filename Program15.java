package NewArrays;

// finding not matching elements
public class Program15 {
	public static void main(String[] args) {
		int ar1[] = { 12, 13, 23, 15, 11, 16 };
		int ar2[] = { 53, 26, 23, 15, 18, 13 };
		// finding not matching elements in ar1[]
		for (int i = 0; i < ar1.length; i++) {
			int find = 0;
			for (int j = 0; j < ar2.length; j++) {
				int find1 = 0;
				if (ar1[i] == ar2[j]) {
					find = 1;
//					break;
				}
			}
			if (find == 0) {
				System.out.println(ar1[i]);
			}
		}
		// finding not matching elements in ar2[]
		for (int i = 0; i < ar2.length; i++) {
			int find = 0;
			for (int j = 0; j < ar1.length; j++) {
				if (ar2[i] == ar1[j]) {
					find = 1;
				}
			}
			if (find == 0) {
				System.out.println(ar2[i]);
			}
		}

	}

}
