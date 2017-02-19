package algo;

public class MergeSort implements SortingAlgo {
	
	public void sort(int[] a) {

		mergesort(a, 0, a.length-1);

		return;
	}


	public void mergesort(int[] a, int p, int q) {
		
		if(p<q) {
			int r = (int)((p+q)/2);
			mergesort(a, p, r);
			mergesort(a, r+1, q);
			merge(a, p, q, r);
		}

		return;

	}

	public void merge(int[] a, int p, int q, int r) {
		int n1 = (r-p)+1;
		int n2 = q-r;

		int[] a1 = new int[n1];
		int[] a2 = new int[n2];

		for(int i=0; i<n1; i++) {
			a1[i] = a[p+i];
		}

		for(int i=0; i<n2; i++) {
			a2[i] = a[r+1+i];
		}
		
		int i1 = 0;
		int i2 = 0;

		
		for(int i=p; i<=q; i++) {
			if(i1<n1 && (i2>=n2 || a1[i1]<a2[i2])) {
				a[i] = a1[i1];
				i1++;
			} else if(i2<n2) {
				a[i] = a2[i2];
				i2++;
			}
		}

	}

}