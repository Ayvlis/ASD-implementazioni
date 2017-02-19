package datastr;

public class Heap {

	int[] heap;
	int heapsize;
	int root;


	public Heap() {
		heapsize = 0;
		heap = null;
		
	}

	public int parent(int i) {
		if(i%2==0) {
			return i/2-1;
		}
		return i/2;
	}

	public int left(int i) {
		return 2*i+1;
	}

	public int right(int i) {
		return 2*i+2;
	}

	public void insert(int x) {
		int[] temp = new int[heapsize]; 
		temp = heap;

		heapsize++;
		heap = new int[heapsize];
		
		for (int i=0; i<heapsize-1; i++) {
			heap[i] = temp[i];
		}
		heap[heapsize-1] = x;
		int i = heapsize-1;
		while(i>1 && heap[i]>heap[parent(i)]) {
			scambia(i, parent(i));
			i = parent(i);
		}

	}

	public int extractMax() {
		if(heapsize==0) {
			return 0;
		}

		int out = root;
		heap[0] = heap[heapsize-1];
		heapsize--;
		heapify(this, 0);
		root = heap[0];
		return out;
	}

	public static Heap buildHeap(int[] a) {
		Heap h = new Heap();	
		h.heapsize = a.length;
		h.heap = new int[h.heapsize];

		for(int i=0; i<a.length; i++) {
			h.heap[i] = a[i];
		}

		for (int i=h.heapsize/2 -1 ; i>=0; i--) {
			heapify(h,i);
			

		}

		h.root = h.heap[0];

		return h;
	}

	public static void heapify(Heap h, int i) {

		int m;
		
		if(h.left(i)<h.heapsize && h.heap[h.left(i)]>h.heap[i]) {
			m = h.left(i);
		} else {
			m = i;
		}

		if(h.right(i)<h.heapsize && h.heap[h.right(i)]>h.heap[m]) {
			m = h.right(i);
		}

		if(m!=i) {
			h.scambia(i, m);
			heapify(h, m);
		}
	}

	public void scambia(int i, int j) {
		
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;

	}

	public String toString() {

		String s = "";
		for (int i=0; i<heapsize; i++) {
			s+=(heap[i]+" ");	
		}
		return s;
	}


}