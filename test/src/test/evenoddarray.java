package test;

public class evenoddarray {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		int[] evenarray = new int[(arr.length / 2) + 1];

		int[] oddarray = new int[(arr.length / 2) + 1];
		System.out.println("even array length   " + arr.length);
		System.out.println("even array length   " + evenarray.length);
		System.out.println("odd array length   " + oddarray.length);

		int i = 0;

		for (int o = 0; o < arr.length; o++) {

			if (arr[o] % 2 == 1) {
			
				oddarray[++i] = arr[o];

			}

		}

		int j = 0;
		for (int o = 0; o < arr.length; o++) {
			     
			if (arr[o] % 2 == 0) {
				
				evenarray[++j] = arr[o];

			}
		}

		System.out.println("even array  ");
		for (int k = 0; k < evenarray.length; k++) {

			System.out.println(evenarray[k]);
		}

		System.out.println("odd array  ");
		for (int m = 0; m < oddarray.length; m++) {
			System.out.println(oddarray[m]);
		}
	}
}
