package algo;

public class SelectionSort implements SortingAlgo {
	
	public void sort(int[] a) {

		for(int i = 0; i<a.length-1; i++) {
			int min = i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[min]) {
					min = j;
				}	
			
			swap(a, i, min);

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