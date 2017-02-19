class UseHeap {

	public static void main(String[] args) {
		int[] array = new int[13];
		for (int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*100+1);	
			System.out.print(array[i]+" ");	
		}

		System.out.println();
		System.out.println();

		Heap heap = Heap.buildHeap(array);

		System.out.println(heap);

		heap.insert(65);

		System.out.println(heap);


	}
}