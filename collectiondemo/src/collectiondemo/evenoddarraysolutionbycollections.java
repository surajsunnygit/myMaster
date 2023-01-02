package collectiondemo;

import java.util.HashSet;
import java.util.Set;

public class evenoddarraysolutionbycollections {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 22, 13, 14, 15, 16, 17, 18, 19, 20 };

		Set<Integer> evenset = new HashSet<>();
		Set<Integer> oddset = new HashSet<>();

		for (int ref : arr) {
			if (ref % 2 == 0) {
				evenset.add(ref);
			} else {
				oddset.add(ref);
			}
		}

		System.out.println("even set");
		for (Integer ref : evenset) {
			System.err.println(ref);
		}

		System.out.println("odd set");
		for (Integer ref : oddset) {
			System.err.println(ref);
		}
		System.err.println("evenset size " + evenset.size());

		int evenarraysize = evenset.size();

		int[] evenarr = new int[evenarraysize];

		int oddarraysize = evenset.size();

		int[] oddarr = new int[oddarraysize];

		int i = 0;
		for (Integer ref : evenset) {

			evenarr[i] = ref;
			i = i + 1;
		}

		int k = 0;
		for (Integer ref : oddset) {

			oddarr[k] = ref;
			k++;
		}

		System.out.println("printing even array elements");
		for (int ref : evenarr) {
			System.out.println(ref);
		}

		System.out.println("printing odd array elements");
		for (int ref : oddarr) {
			System.out.println(ref);
		}

	}
}
