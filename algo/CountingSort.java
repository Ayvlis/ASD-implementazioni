package algo;

public class CountingSort implements SortingAlgo {
	
	public void sort(int[] a) {
		if(a.length<=0) {
			return;
		}

		int max = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}	
		}

		countingSort(a, max);

		return;
	}

	private void countingSort(int[] a, int k) {
		int[] b = new int[k+1];

		for(int i=0; i<a.length; i++) {
			b[a[i]]++;
		}

		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+"|");
		}

		int j=0;

		for(int i=0; i<b.length; i++) {


			while(b[i]>0) {
					a[j] = i;
				j++;
				b[i]--;
			}
		}
	}

	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return;
	}

}