package algo;

public class InsertionSort implements SortingAlgo {
	
	public void sort(int[] a) {

		for(int i = 1; i<a.length; i++) {
			int j = i-1;
			while(j>=0 && a[j]>a[j+1]) {
				swap(a, j, j+1);
				j = j-1;
			}
		}

		return;
	}

	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return;
	}

}