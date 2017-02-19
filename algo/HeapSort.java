package algo;

import datastr.Heap;

public class HeapSort implements SortingAlgo {
	
	public void sort(int[] a) {

		if(a.length<=0) {
			return;
		}

		Heap h = Heap.buildHeap(a);


		for(int i=a.length-1; i>=0; i--) {
			a[i] = h.extractMax();
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