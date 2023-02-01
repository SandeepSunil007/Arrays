package NewArrays;

// ZigZag Array
public class Program17 {
	public static void main(String[] args) {
		int[] values1 = { 10, 30, 50, 70, 90 };
		int[] values2 = { 20, 40, 60, 80, 100 };
		int[] storeData = new int[values1.length + values2.length];

		// Logic 1

//		System.out.println("length : " + storeData.length);
//		int k = 0;
//		for (int i = 0; i < values1.length; i++, k++) {
//			storeData[k] = values1[i];
//			k++;
//		}
//		k = 0;
//		System.out.println("k :" + k);
//		for (int i = 0; i < values2.length; i++, k++) {
//			storeData[k + 1] = values2[i];
//			k++;
//		}
//		System.out.println("printing");
//		for (k = 0; k < storeData.length; k++) {
//			System.out.println(storeData[k]);
//		}

		// Logic 2

		int i = 0;
		int j = 0;

		for (int k = 0; k < storeData.length;) {
			if (i < values1.length) {
				storeData[k] = values1[i];
				i++;
				k++;
			}
			if (j < values2.length) {
				storeData[k] = values2[j];
				j++;
				k++;

			}
		}
		System.out.println("ZIGZAG ARRAY IS");
		for (int l = 0; l < storeData.length; l++) {
			System.out.print(" " + storeData[l]);
		}
	}

}
