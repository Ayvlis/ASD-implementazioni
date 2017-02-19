package algo;

public class QuickSort implements SortingAlgo {
	
	public void sort(int[] a) {

		quickSort(a, 0, a.length-1);

		return;
	}

	private void quickSort(int[] a, int p, int q) {
		if(p<q) {
			int r = partition(a, p, q);
			quickSort(a, p, r-1);
			quickSort(a, r+1, q);
		}
	}

	private int partition(int[] a, int p, int q) {
		
		int x = a[q]; 
		int j= p-1;
		
		for(int i=p; i<=q; i++) {

			if(a[i]<=x) {
				j++;
				swap(a, i, j);
			}
		}

		return j;
	}

	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return;
	}

}