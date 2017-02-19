
import algo.*;

class Sort {

	public static void main(String[] args) {

		SortingAlgo algo = new QuickSort();

		//int[] a = RandomArray.array(100);
		//int[] a = {12,9,9,9,9};
		//int[] a = {0};
		//int[] a = {9,9,9,9,9};
		int[] a = {};

		arrayToString(a);

		algo.sort(a);

		arrayToString(a);


	}

	public static void arrayToString(int[] a) {

		System.out.print("|");

		for (int el : a) {
			System.out.print(el + "|");	
		}

		System.out.println();
	}
}